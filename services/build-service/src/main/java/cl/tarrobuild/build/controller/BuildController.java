package cl.tarrobuild.build.controller;

import cl.tarrobuild.build.dto.BuildRequest;
import cl.tarrobuild.build.dto.BuildResponse;
import cl.tarrobuild.build.service.BuildService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/builds")
public class BuildController {

    private final BuildService buildService;

    public BuildController(BuildService buildService) {
        this.buildService = buildService;
    }

    @GetMapping
    public ResponseEntity<List<BuildResponse>> getBuilds() {
        return ResponseEntity.ok(buildService.getBuilds());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BuildResponse> getBuildById(@PathVariable Long id) {
        return buildService.getBuildById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<BuildResponse> createBuild(@Valid @RequestBody BuildRequest request) {
        BuildResponse created = buildService.createBuild(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BuildResponse> updateBuild(@PathVariable Long id, @Valid @RequestBody BuildRequest request) {
        return buildService.updateBuild(id, request)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBuild(@PathVariable Long id) {
        boolean deleted = buildService.deleteBuild(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}


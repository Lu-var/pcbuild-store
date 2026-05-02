package cl.tarrobuild.build.controller;

import cl.tarrobuild.build.dto.BuildItemRequest;
import cl.tarrobuild.build.dto.BuildItemResponse;
import cl.tarrobuild.build.service.BuildItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/builds/{buildId}/items")
public class BuildItemController {
    private final BuildItemService buildItemService;

    public BuildItemController(BuildItemService buildItemService) {
        this.buildItemService = buildItemService;
    }

    @GetMapping()
    public ResponseEntity<List<BuildItemResponse>> getBuildItems() {
        return ResponseEntity.ok(buildItemService.getAllItems());
    }

    @GetMapping()
    public ResponseEntity<BuildItemResponse> getBuildItemById(@PathVariable Long buildId) {
        return buildItemService.getItemById(buildId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<BuildItemResponse> createBuildItem(@PathVariable Long buildId, @Valid @RequestBody BuildItemRequest request) {
        BuildItemResponse buildItemResponse = buildItemService.createBuildItem(buildId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(buildItemResponse);
    }
}
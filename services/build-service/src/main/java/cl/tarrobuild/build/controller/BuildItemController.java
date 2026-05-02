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
    public ResponseEntity<List<BuildItemResponse>> getItems(@PathVariable Long buildId) {
        return ResponseEntity.ok(buildItemService.getItemsByBuildId(buildId));
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<BuildItemResponse> getItemById(@PathVariable Long buildId, @PathVariable Long itemId) {
        return buildItemService.getItemByIdAndBuildId(itemId, buildId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<BuildItemResponse> createItem(@PathVariable Long buildId, @Valid @RequestBody BuildItemRequest request) {
        BuildItemResponse buildItemResponse = buildItemService.createItem(buildId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(buildItemResponse);
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long buildId, @PathVariable Long itemId) {
        boolean deleted = buildItemService.deleteItem(itemId, buildId);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
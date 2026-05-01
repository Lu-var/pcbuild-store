package cl.tarrobuild.build.service;

import cl.tarrobuild.build.dto.BuildItemRequest;
import cl.tarrobuild.build.dto.BuildItemResponse;
import cl.tarrobuild.build.dto.BuildResponse;
import cl.tarrobuild.build.model.Build;
import cl.tarrobuild.build.model.BuildItem;
import cl.tarrobuild.build.repository.BuildItemRepository;
import cl.tarrobuild.build.repository.BuildRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuildItemService {

    private final BuildItemRepository buildItemRepository;
    private final BuildRepository buildRepository;

    public BuildItemService(BuildItemRepository buildItemRepository, BuildRepository buildRepository) {
        this.buildItemRepository = buildItemRepository;
        this.buildRepository = buildRepository;
    }

    public List<BuildItemResponse> getAllItems() {
        return buildItemRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public Optional<BuildItemResponse> getItemById(Long id) { // Renamed for clarity
        return buildItemRepository.findById(id)
                .map(this::toResponse);
    }

    public BuildItemResponse createBuildItem(BuildItemRequest request) {
        Build targetBuild = buildRepository.findById(request.buildId())
                .orElseThrow(() -> new IllegalArgumentException("Build with ID " + request.buildId() + " not found"));

        BuildItem newItem = new BuildItem();
        newItem.setProductId(request.productId());
        newItem.setQuantity(request.quantity());
        newItem.setBuild(targetBuild);

        targetBuild.getItems().add(newItem);

        BuildItem saved = buildItemRepository.save(newItem);
        return toResponse(saved);
    }

    public boolean deleteItem(Long id) {
        if (!buildItemRepository.existsById(id)) {
            return false;
        }
        buildItemRepository.deleteById(id);
        return true;
    }

    private BuildItemResponse toResponse(BuildItem item) {
        return new BuildItemResponse(
                item.getId(),
                Optional.ofNullable(item.getBuild())
                        .map(Build::getId)
                        .orElse(null),
                item.getProductId(),
                item.getQuantity()
        );
    }
}


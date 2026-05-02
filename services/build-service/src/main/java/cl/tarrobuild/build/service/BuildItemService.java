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

    public List<BuildItemResponse> getItemsByBuildId(Long buildId) {
        if (!buildRepository.existsById(buildId)) {
            throw new IllegalArgumentException("Build with ID " + buildId + " not found");
        }
        return buildItemRepository.findByBuild_Id(buildId)
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public Optional<BuildItemResponse> getItemByIdAndBuildId(Long itemId, Long buildId) {
        return buildItemRepository.findByIdAndBuild_Id(itemId, buildId)
                .map(this::toResponse);
    }

    public BuildItemResponse createItem(Long buildId, BuildItemRequest request) {
        Build targetBuild = buildRepository.findById(buildId)
                .orElseThrow(() -> new IllegalArgumentException("Build with ID " + buildId + " not found"));

        BuildItem newItem = new BuildItem();
        newItem.setProductId(request.productId());
        newItem.setQuantity(request.quantity());
        newItem.setBuild(targetBuild);

        BuildItem saved = buildItemRepository.save(newItem);
        return toResponse(saved);
    }

    public boolean deleteItem(Long itemId, Long buildId) {
        return buildItemRepository.findByIdAndBuild_Id(itemId, buildId)
                .map(item -> {
                    buildItemRepository.delete(item);
                    return true;
                })
                .orElse(false);
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


package cl.tarrobuild.build.service;

import cl.tarrobuild.build.dto.BuildItemRequest;
import cl.tarrobuild.build.dto.BuildItemResponse;
import cl.tarrobuild.build.model.Build;
import cl.tarrobuild.build.model.BuildItem;
import cl.tarrobuild.build.repository.BuildItemRepository;
import cl.tarrobuild.build.repository.BuildRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class BuildItemService {

    private final BuildItemRepository buildItemRepository;
    private final BuildRepository buildRepository;

    public BuildItemService(BuildItemRepository buildItemRepository, BuildRepository buildRepository) {
        this.buildItemRepository = buildItemRepository;
        this.buildRepository = buildRepository;
    }

    public List<BuildItemResponse> getItemsByBuildId(Long buildId) {
        log.info("Getting items for buildId: {}", buildId);
        buildRepository.findById(buildId)
                .orElseThrow(() -> new EntityNotFoundException("Build with ID " + buildId + " not found"));

        return buildItemRepository.findByBuild_Id(buildId)
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public BuildItemResponse getItemByIdAndBuildId(Long itemId, Long buildId) {
        log.info("Getting item with ID {} for buildId: {}", itemId, buildId);
        return buildItemRepository.findByIdAndBuild_Id(itemId, buildId)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("Item with ID " + itemId + " not found for build " + buildId));
    }

    public BuildItemResponse createItem(Long buildId, BuildItemRequest request) {
        log.info("Creating item for buildId: {}", buildId);
        Build targetBuild = buildRepository.findById(buildId)
                .orElseThrow(() -> new EntityNotFoundException("Build with ID " + buildId + " not found"));

        log.info("Creating item with productId: {} and quantity: {}", request.productId(), request.quantity());
        BuildItem newItem = new BuildItem();
        newItem.setProductId(request.productId());
        newItem.setQuantity(request.quantity());
        newItem.setBuild(targetBuild);

        BuildItem saved = buildItemRepository.save(newItem);
        return toResponse(saved);
    }

    public void deleteItem(Long itemId, Long buildId) {
        log.info("Deleting item with ID {} for buildId: {}", itemId, buildId);
        BuildItem item = buildItemRepository.findByIdAndBuild_Id(itemId, buildId)
                .orElseThrow(() -> new EntityNotFoundException("Item with ID " + itemId + " not found for build " + buildId));
        buildItemRepository.delete(item);
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


package cl.tarrobuild.build.service;

import cl.tarrobuild.build.dto.BuildItemRequest;
import cl.tarrobuild.build.dto.BuildItemResponse;
import cl.tarrobuild.build.dto.BuildRequest;
import cl.tarrobuild.build.dto.BuildResponse;
import cl.tarrobuild.build.model.Build;
import cl.tarrobuild.build.model.BuildItem;
import cl.tarrobuild.build.repository.BuildRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BuildService {

    private final BuildRepository buildRepository;

    public BuildService(BuildRepository buildRepository) {
        this.buildRepository = buildRepository;
    }

    @Transactional(readOnly = true)
    public List<BuildResponse> getBuilds() {
        return buildRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    @Transactional(readOnly = true)
    public Optional<BuildResponse> getBuildById(Long id) {
        return buildRepository.findById(id)
                .map(this::toResponse);
    }

    public BuildResponse createBuild(BuildRequest request) {
        Build build = new Build();
        build.setUserId(request.userId());
        build.setName(request.name());
        build.setItems(toItemEntities(request.items(), build));

        Build saved = buildRepository.save(build);
        return toResponse(saved);
    }

    @Transactional
    public Optional<BuildResponse> updateBuild(Long id, BuildRequest request) {
        return buildRepository.findById(id)
                .map(build -> {
                    build.setUserId(request.userId());
                    build.setName(request.name());
                    if (request.items() != null) {
                        build.setItems(toItemEntities(request.items(), build));
                    }
                    Build saved = buildRepository.save(build);
                    return toResponse(saved);
                });
    }

    public boolean deleteBuild(Long id) {
        if (!buildRepository.existsById(id)) {
            return false;
        }
        buildRepository.deleteById(id);
        return true;
    }

    private BuildResponse toResponse(Build build) {
        List<BuildItemResponse> items = build.getItems() == null
                ? Collections.emptyList()
                : build.getItems().stream()
                .map(this::toItemResponse)
                .toList();

        return new BuildResponse(
                build.getId(),
                build.getUserId(),
                build.getName(),
                build.getStatus(),
                build.getCreatedAt(),
                items
        );
    }

    private BuildItemResponse toItemResponse(BuildItem item) {
        Long buildId = item.getBuild() == null ? null : item.getBuild().getId();
        return new BuildItemResponse(
                item.getId(),
                buildId,
                item.getProductId(),
                item.getQuantity()
        );
    }

    private List<BuildItem> toItemEntities(List<BuildItemRequest> items, Build build) {
        if (items == null) {
            return Collections.emptyList();
        }

        return items.stream()
                .map(request -> {
                    BuildItem item = new BuildItem();
                    item.setProductId(request.productId());
                    item.setQuantity(request.quantity());
                    item.setBuild(build);
                    return item;
                })
                .toList();
    }
}


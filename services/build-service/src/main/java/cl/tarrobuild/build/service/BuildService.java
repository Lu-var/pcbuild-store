package cl.tarrobuild.build.service;

import cl.tarrobuild.build.dto.BuildItemResponse;
import cl.tarrobuild.build.dto.BuildRequest;
import cl.tarrobuild.build.dto.BuildResponse;
import cl.tarrobuild.build.model.Build;
import cl.tarrobuild.build.model.BuildItem;
import cl.tarrobuild.build.repository.BuildRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class BuildService {

    private final BuildRepository buildRepository;

    public BuildService(BuildRepository buildRepository) {
        this.buildRepository = buildRepository;
    }

    public List<BuildResponse> getBuilds() {
        log.info("Getting all builds");
        return buildRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public Optional<BuildResponse> getBuildById(Long id) {
        log.info("Getting build by id: {}", id);
        return buildRepository.findById(id)
                .map(this::toResponse);
    }

    public List<BuildResponse> getBuildsByUserId(Long userId){
        log.info("Getting builds for userId: {}", userId);
        return buildRepository.findByUserId(userId).stream()
                .map(this::toResponse)
                .toList();
    }

    public Optional<BuildResponse> getBuildByIdAndUserId(Long buildId, Long userId){
        log.info("Getting build by id: {} and userId: {}", buildId, userId);
        return buildRepository.findByIdAndUserId(buildId, userId)
                .map(this::toResponse);
    }

    public BuildResponse createBuild(BuildRequest request) {
        log.info("Creating build \"{}\" userId: {}", request.name(), request.userId());
        Build build = new Build();
        build.setUserId(request.userId());
        build.setName(request.name());

        Build saved = buildRepository.save(build);
        return toResponse(saved);
    }

    public Optional<BuildResponse> updateBuild(Long id, BuildRequest request) {
        log.info("Updating build id: {} with name: \"{}\" from userId: {}", id, request.name(), request.userId());
        return buildRepository.findById(id)
                .map(build -> {
                    build.setUserId(request.userId());
                    build.setName(request.name());

                    Build saved = buildRepository.save(build);;
                    return toResponse(saved);
                });
    }

    public boolean deleteBuild(Long id) {
        if (!buildRepository.existsById(id)) {
            log.info("Build with id: {} not found for deletion", id);
            return false;
        }
        buildRepository.deleteById(id);
        log.info("Build with id: {} deleted successfully", id);
        return true;
    }

    private BuildResponse toResponse(Build build) {
        return new BuildResponse(
                build.getId(),
                build.getUserId(),
                build.getName(),
                build.getStatus().name(),
                build.getCreatedAt(),
                toItemResponseList(build.getItems())
        );
    }

    private List<BuildItemResponse> toItemResponseList(List<BuildItem> items) {
        return items.stream()
                .map(this::toItemResponse)
                .toList();
    }

    private BuildItemResponse toItemResponse(BuildItem item) {
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


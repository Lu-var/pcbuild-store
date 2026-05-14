package cl.tarrobuild.estimate.service;

import cl.tarrobuild.estimate.dto.EstimateRequest;
import cl.tarrobuild.estimate.dto.EstimateResponse;
import cl.tarrobuild.estimate.model.Estimate;
import cl.tarrobuild.estimate.repository.EstimateRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EstimateService {

    private final EstimateRepository estimateRepository;

    public EstimateService(EstimateRepository estimateRepository) {
        this.estimateRepository = estimateRepository;
    }

    public EstimateResponse calculate(EstimateRequest request) {
        log.info("Calculating estimate for buildId: {}", request.buildId());

        Estimate estimate = new Estimate();
        estimate.setBuildId(request.buildId());
        estimate.setTotalPrice(0);
        if (request.currency() != null) {
            estimate.setCurrency(request.currency());
        }

        Estimate saved = estimateRepository.save(estimate);
        log.info("Estimate created with id: {} for buildId: {}", saved.getId(), saved.getBuildId());
        return toResponse(saved);
    }

    public List<EstimateResponse> getEstimatesByBuildId(Long buildId) {
        log.info("Getting estimates for buildId: {}", buildId);
        return estimateRepository.findByBuildId(buildId).stream()
                .map(this::toResponse)
                .toList();
    }

    public EstimateResponse getLatestEstimateByBuildId(Long buildId) {
        log.info("Getting latest estimate for buildId: {}", buildId);
        return estimateRepository.findTopByBuildIdOrderByCreatedAtDesc(buildId)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException(
                        "No estimate found for build ID " + buildId));
    }

    public EstimateResponse getEstimateById(Long id) {
        log.info("Getting estimate by id: {}", id);
        return estimateRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException(
                        "Estimate with ID " + id + " not found"));
    }

    private EstimateResponse toResponse(Estimate estimate) {
        return new EstimateResponse(
                estimate.getId(),
                estimate.getBuildId(),
                estimate.getTotalPrice(),
                estimate.getCurrency(),
                estimate.getCreatedAt()
        );
    }
}

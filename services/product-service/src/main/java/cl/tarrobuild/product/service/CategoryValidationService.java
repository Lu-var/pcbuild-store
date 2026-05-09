package cl.tarrobuild.product.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Placeholder for category-service integration.
 * Currently performs no external call — throws EntityNotFoundException
 * for any categoryId to simulate "category not found" behavior.
 * When Feign client is wired in, this class will call category-service
 * to verify the category exists before allowing product creation/update.
 */
@Service
@Slf4j
public class CategoryValidationService {

    /**
     * Validates that a category exists.
     * Currently a stub that always throws — safe to call even when
     * category-service is down, but will reject all categoryIds until real integration.
     *
     * @param categoryId the category ID to validate
     * @throws EntityNotFoundException always, until Feign integration is implemented
     */
    public void validateCategoryExists(Long categoryId) {
        log.warn("Category validation is a PLACEHOLDER — category-service call not implemented yet");
        throw new EntityNotFoundException(
                "Category with ID " + categoryId + " not found (placeholder — service communication not wired)"
        );
    }
}

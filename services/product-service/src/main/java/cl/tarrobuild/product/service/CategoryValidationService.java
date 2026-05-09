package cl.tarrobuild.product.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryValidationService {

    //Validates that a category exists.
    //Currently a no-op placeholder — accepts all categoryIds.
    //Logs a warning on first call to remind that real integration is pending.

    //When Feign is wired, replace the body with a remote call and
    //throw EntityNotFoundException if the category doesn't exist.

    // TODO: call category-service via Feign client to verify existence
    public void validateCategoryExists(Long categoryId) {
        log.warn("Category validation PLACEHOLDER — accepting categoryId {} without verification", categoryId);
    }
}

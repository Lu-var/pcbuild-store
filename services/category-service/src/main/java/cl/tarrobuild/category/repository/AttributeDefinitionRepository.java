package cl.tarrobuild.category.repository;

import cl.tarrobuild.category.model.AttributeDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AttributeDefinitionRepository extends JpaRepository<AttributeDefinition, Long> {

    List<AttributeDefinition> findByCategoryId(Long categoryId);
    List<AttributeDefinition> findByCategoryIdAndIsRequired(Long categoryId, boolean isRequired);
    Optional<AttributeDefinition> findByIdAndCategoryId(Long id, Long categoryId);
    boolean existsByAttributeNameAndCategoryId(String attributeName, Long categoryId);
}
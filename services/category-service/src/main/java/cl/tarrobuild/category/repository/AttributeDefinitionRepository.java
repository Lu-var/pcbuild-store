package cl.tarrobuild.category.repository;

import cl.tarrobuild.category.model.AttributeDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttributeDefinitionRepository extends JpaRepository<AttributeDefinition, Long> {

    List<AttributeDefinition> findByCategoryId(Long categoryId);

}
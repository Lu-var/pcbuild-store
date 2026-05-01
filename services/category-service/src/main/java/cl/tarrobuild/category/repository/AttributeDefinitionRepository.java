package cl.tarrobuild.category.repository;

import com.tarrobuild.categoryservice.entity.AttributeDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttributeDefinitionRepository extends JpaRepository<AttributeDefinition, Long> {

    List<AttributeDefinition> findByCategoryId(Long categoryId);

}
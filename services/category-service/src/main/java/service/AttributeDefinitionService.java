package service;

import com.tarrobuild.categoryservice.entity.AttributeDefinition;
import com.tarrobuild.categoryservice.entity.Category;
import com.tarrobuild.categoryservice.repository.AttributeDefinitionRepository;
import com.tarrobuild.categoryservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class AttributeDefinitionService {

        private final AttributeDefinitionRepository attributeDefinitionRepository;
        private final CategoryRepository categoryRepository;

        public AttributeDefinitionService(AttributeDefinitionRepository attributeDefinitionRepository,
                                          CategoryRepository categoryRepository) {
            this.attributeDefinitionRepository = attributeDefinitionRepository;
            this.categoryRepository = categoryRepository;
        }

        public AttributeDefinition createAttribute(Long categoryId, AttributeDefinition attributeDefinition) {

            Category category = categoryRepository.findById(categoryId)
                    .orElseThrow(() -> new RuntimeException("Category not found"));

            attributeDefinition.setCategory(category);

            return attributeDefinitionRepository.save(attributeDefinition);
        }

        public List<AttributeDefinition> getAttributesByCategory(Long categoryId) {

            categoryRepository.findById(categoryId)
                    .orElseThrow(() -> new RuntimeException("Category not found"));

            return attributeDefinitionRepository.findByCategoryId(categoryId);
        }
    }
}

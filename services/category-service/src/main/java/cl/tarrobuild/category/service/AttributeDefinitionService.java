package cl.tarrobuild.category.service;

import cl.tarrobuild.category.dto.AttributeDefinitionRequest;
import cl.tarrobuild.category.dto.AttributeDefinitionResponse;
import cl.tarrobuild.category.dto.CategoryResponse;
import cl.tarrobuild.category.model.AttributeDefinition;
import cl.tarrobuild.category.model.Category;
import cl.tarrobuild.category.repository.AttributeDefinitionRepository;
import cl.tarrobuild.category.repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public AttributeDefinitionResponse createAttribute(Long categoryId, AttributeDefinitionRequest request) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        AttributeDefinition newDefinition = new AttributeDefinition();
        newDefinition.setAttributeName(request.attributeName());
        newDefinition.setValueType(request.valueType());
        newDefinition.setIsRequired(request.isRequired());
        newDefinition.setCategory(category);

        AttributeDefinition saved = attributeDefinitionRepository.save(newDefinition);
        return toResponse(saved);
    }

    public List<AttributeDefinitionResponse> getAttributesByCategory(Long categoryId) {
        categoryRepository.findById(categoryId)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));

        return attributeDefinitionRepository.findByCategoryId(categoryId)
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public AttributeDefinitionResponse toResponse(AttributeDefinition attributeDefinition) {
        return new AttributeDefinitionResponse(
                attributeDefinition.getId(),
                attributeDefinition.getAttributeName(),
                attributeDefinition.getValueType(),
                attributeDefinition.getIsRequired(),
                attributeDefinition.getCategory().getId()
        );
    }

    public CategoryResponse categoryToResponse(Category category){
        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getSlug(),
                category.getDescription(),
                category.getIsActive(),
                category.getAttributes()
                        .stream()
                        .map(this::toResponse)
                        .toList()
        );
    }
}
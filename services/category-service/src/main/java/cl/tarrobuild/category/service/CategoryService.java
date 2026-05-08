package cl.tarrobuild.category.service;

import cl.tarrobuild.category.dto.AttributeDefinitionResponse;
import cl.tarrobuild.category.dto.CategoryRequest;
import cl.tarrobuild.category.dto.CategoryResponse;
import cl.tarrobuild.category.model.AttributeDefinition;
import cl.tarrobuild.category.model.Category;
import cl.tarrobuild.category.repository.CategoryRepository;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryResponse createCategory(CategoryRequest request) {
        if (categoryRepository.findBySlug(request.slug()).isPresent()) {
            throw new EntityExistsException("Slug already exists");
        }

        Category newCategory = new Category();
        newCategory.setName(request.name());
        newCategory.setSlug(request.slug());
        newCategory.setDescription(request.description());

        Category saved = categoryRepository.save(newCategory);
        return toResponse(saved);
    }

    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public CategoryResponse getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
    }

    public CategoryResponse toResponse(Category category){
        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getSlug(),
                category.getDescription(),
                category.getIsActive(),
                category.getAttributes()
                        .stream()
                        .map(cat -> new AttributeDefinitionResponse(
                                cat.getId(),
                                cat.getAttributeName(),
                                cat.getValueType(),
                                cat.getIsRequired(),
                                cat.getCategory().getId()
                        ))
                        .toList()
        );
    }
}
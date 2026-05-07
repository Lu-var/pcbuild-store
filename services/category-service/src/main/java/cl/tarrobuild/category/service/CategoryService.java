package cl.tarrobuild.category.service;

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

    public Category createCategory(Category category) {
        if (categoryRepository.findBySlug(category.getSlug()).isPresent()) {
            throw new EntityExistsException("Slug already exists");
        }
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll().stream()
                .toList();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
    }
}
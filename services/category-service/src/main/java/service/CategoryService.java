package service;

import com.tarrobuild.categoryservice.entity.Category;
import com.tarrobuild.categoryservice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class CategoryService {

        private final CategoryRepository categoryRepository;

        public CategoryService(CategoryRepository categoryRepository) {
            this.categoryRepository = categoryRepository;
        }

        public Category createCategory(Category category) {
            return categoryRepository.save(category);
        }

        public List<Category> getAllCategories() {
            return categoryRepository.findAll();
        }

        public Category getCategoryById(Long id) {
            return categoryRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Category not found"));
        }
    }
}

package cl.tarrobuild.category.repository;

import cl.tarrobuild.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findBySlug(String slug);
    boolean existsBySlug(String slug);
    boolean existsByName(String name);
    List<Category> findByIsActive(boolean isActive);
}
package cl.tarrobuild.build.repository;

import cl.tarrobuild.build.model.BuildItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildItemRepository extends JpaRepository<BuildItem, Long> {
}


package cl.tarrobuild.build.repository;

import cl.tarrobuild.build.model.BuildItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BuildItemRepository extends JpaRepository<BuildItem, Long> {
    List<BuildItem> findByBuild_Id(Long buildId);
    Optional<BuildItem> findByIdAndBuild_Id(Long id, Long buildId);
}
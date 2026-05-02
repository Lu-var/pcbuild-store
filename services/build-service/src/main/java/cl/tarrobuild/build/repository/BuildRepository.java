package cl.tarrobuild.build.repository;

import cl.tarrobuild.build.model.Build;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BuildRepository extends JpaRepository<Build, Long> {
    List<Build> findByUserId(Long userId);
    Optional<Build> findByIdAndUserId(Long id, Long userId);
}


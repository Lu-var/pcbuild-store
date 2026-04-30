package cl.tarrobuild.build.repository;

import cl.tarrobuild.build.model.Build;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildRepository extends JpaRepository<Build, Long> {
}


package cl.tarrobuild.user.repository;

import cl.tarrobuild.user.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findByRegionId(Long regionId);
    Optional<City> findByNameAndRegionId(String name, Long regionId);
}


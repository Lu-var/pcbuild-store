package cl.tarrobuild.provider.repository;

import cl.tarrobuild.provider.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
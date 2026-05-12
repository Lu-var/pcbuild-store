package cl.tarrobuild.provider.Repository;

import cl.tarrobuild.provider.Entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
package cl.tarrobuild.provider.service;

import cl.tarrobuild.provider.entity.Provider;
import cl.tarrobuild.provider.repository.ProviderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }

    public Provider getProviderById(Long id) {
        return providerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Provider not found"));
    }

    public Provider updateProvider(Long id, Provider updatedProvider) {

        Provider provider = getProviderById(id);

        provider.setName(updatedProvider.getName());
        provider.setContact(updatedProvider.getContact());
        provider.setWebsite(updatedProvider.getWebsite());
        provider.setIsActive(updatedProvider.getIsActive());

        return providerRepository.save(provider);
    }

    public void deleteProvider(Long id) {

        Provider provider = getProviderById(id);

        providerRepository.delete(provider);
    }
}
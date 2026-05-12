package cl.tarrobuild.provider.service;

import cl.tarrobuild.provider.dto.ProviderRequest;
import cl.tarrobuild.provider.dto.ProviderResponse;
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

    public ProviderResponse createProvider(ProviderRequest request) {

        Provider provider = new Provider();

        provider.setName(request.getName());
        provider.setContact(request.getContact());
        provider.setWebsite(request.getWebsite());
        provider.setIsActive(request.getIsActive());

        Provider savedProvider = providerRepository.save(provider);

        return mapToResponse(savedProvider);
    }

    public List<ProviderResponse> getAllProviders() {

        return providerRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    public ProviderResponse getProviderById(Long id) {

        Provider provider = providerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Provider not found"));

        return mapToResponse(provider);
    }

    public ProviderResponse updateProvider(
            Long id,
            ProviderRequest request) {

        Provider provider = providerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Provider not found"));

        provider.setName(request.getName());
        provider.setContact(request.getContact());
        provider.setWebsite(request.getWebsite());
        provider.setIsActive(request.getIsActive());

        Provider updatedProvider = providerRepository.save(provider);

        return mapToResponse(updatedProvider);
    }

    public void deleteProvider(Long id) {

        Provider provider = providerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Provider not found"));

        providerRepository.delete(provider);
    }

    private ProviderResponse mapToResponse(Provider provider) {

        return new ProviderResponse(
                provider.getId(),
                provider.getName(),
                provider.getContact(),
                provider.getWebsite(),
                provider.getIsActive()
        );
    }
}
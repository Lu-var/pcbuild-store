package cl.tarrobuild.provider.controller;

import cl.tarrobuild.provider.entity.Provider;
import cl.tarrobuild.provider.service.ProviderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {

    private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @PostMapping
    public ResponseEntity<Provider> createProvider(
            @RequestBody Provider provider) {

        return new ResponseEntity<>(
                providerService.createProvider(provider),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<Provider>> getAllProviders() {

        return ResponseEntity.ok(
                providerService.getAllProviders()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Provider> getProviderById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                providerService.getProviderById(id)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Provider> updateProvider(
            @PathVariable Long id,
            @RequestBody Provider provider) {

        return ResponseEntity.ok(
                providerService.updateProvider(id, provider)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProvider(
            @PathVariable Long id) {

        providerService.deleteProvider(id);

        return ResponseEntity.noContent().build();
    }
}
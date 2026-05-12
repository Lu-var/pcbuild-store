package cl.tarrobuild.provider.controller;

import cl.tarrobuild.provider.dto.ProviderRequest;
import cl.tarrobuild.provider.dto.ProviderResponse;
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
    public ResponseEntity<ProviderResponse> createProvider(
            @RequestBody ProviderRequest request) {

        return new ResponseEntity<>(
                providerService.createProvider(request),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<ProviderResponse>> getAllProviders() {

        return ResponseEntity.ok(
                providerService.getAllProviders()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProviderResponse> getProviderById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                providerService.getProviderById(id)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProviderResponse> updateProvider(
            @PathVariable Long id,
            @RequestBody ProviderRequest request) {

        return ResponseEntity.ok(
                providerService.updateProvider(id, request)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProvider(
            @PathVariable Long id) {

        providerService.deleteProvider(id);

        return ResponseEntity.noContent().build();
    }
}
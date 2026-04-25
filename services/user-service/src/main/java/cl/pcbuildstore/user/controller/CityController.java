package cl.pcbuildstore.user.controller;

import cl.pcbuildstore.user.dto.CityDTO;
import cl.pcbuildstore.user.model.City;
import cl.pcbuildstore.user.service.CityService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public ResponseEntity<List<CityDTO>> getAllCities() {
        return ResponseEntity.ok(cityService.getAllCities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CityDTO> getCityById(@PathVariable Long id) {
        return cityService.getCityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/region/{regionId}")
    public ResponseEntity<List<CityDTO>> getCitiesByRegionId(@PathVariable Long regionId) {
        return ResponseEntity.ok(cityService.getCitiesByRegionId(regionId));
    }

    @PostMapping
    public ResponseEntity<CityDTO> createCity(@Valid @RequestBody CityDTO city) {
        CityDTO created = cityService.createCity(city);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CityDTO> updateCity(@PathVariable Long id, @RequestBody CityDTO city) {
        return cityService.updateCity(id, city)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
        return ResponseEntity.noContent().build();
    }
}



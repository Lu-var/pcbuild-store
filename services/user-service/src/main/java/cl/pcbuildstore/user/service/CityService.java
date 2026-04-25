package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.dto.CityDTO;
import cl.pcbuildstore.user.model.City;
import cl.pcbuildstore.user.model.Region;
import cl.pcbuildstore.user.repository.CityRepository;
import cl.pcbuildstore.user.repository.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CityService {

    private final CityRepository cityRepository;
    private final RegionRepository regionRepository;

    public CityService(CityRepository cityRepository, RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
        this.cityRepository = cityRepository;
    }

    public Optional<CityDTO> getCityById(Long id) {
        return cityRepository.findById(id)
                .map(CityDTO::new);
    }

    public List<CityDTO> getCitiesByRegionId(Long regionId) {
        return cityRepository.findByRegionId(regionId)
                .stream()
                .map(CityDTO::new)
                .toList();
    }

    public Optional<CityDTO> getCityByNameAndRegionId(String name, Long regionId) {
        return cityRepository.findByNameAndRegionId(name, regionId)
                .map(CityDTO::new);
    }

    public List<CityDTO> getAllCities() {
        return cityRepository.findAll()
                .stream()
                .map(CityDTO::new)
                .toList();

    }

    public CityDTO createCity(CityDTO cityData) {
        Region region = regionRepository.findById(cityData.getRegionId())
                .orElseThrow(() -> new RuntimeException("Region not found: " + cityData.getRegionId()));

        City newCity = new City();
        newCity.setName(cityData.getName());
        newCity.setRegion(region);
        City saved = cityRepository.save(newCity);
        return new CityDTO(saved);

    }

    public Optional<CityDTO> updateCity(Long id, CityDTO cityData) {
        return cityRepository.findById(id)
                .map(city -> {
                    Region region = regionRepository.findById(cityData.getRegionId())
                            .orElseThrow(() -> new RuntimeException("Region not found: " + cityData.getRegionId()));
                    city.setName(cityData.getName());
                    city.setRegion(region);
                    City saved = cityRepository.save(city);
                    return new CityDTO(saved);
                });
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}

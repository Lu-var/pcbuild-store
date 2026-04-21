package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.model.City;
import cl.pcbuildstore.user.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Optional<City> getCityById(Long id) {
        return cityRepository.findById(id);
    }

    public List<City> getCitiesByRegionId(Long regionId) {
        return cityRepository.findByRegionId(regionId);
    }

    public Optional<City> getCityByNameAndRegionId(String name, Long regionId) {
        return cityRepository.findByNameAndRegionId(name, regionId);
    }

    public Map<Long, City> getAllCities() {
        Map<Long, City> citiesMap = new HashMap<>();
        cityRepository.findAll().forEach(city -> citiesMap.put(city.getId(), city));
        return citiesMap;
    }

    public City createCity(City city) {
        return cityRepository.save(city);
    }

    public City updateCity(Long id, City cityDetails) {
        return cityRepository.findById(id)
                .map(city -> {
                    city.setName(cityDetails.getName());
                    return cityRepository.save(city);
                })
                .orElseThrow(() -> new RuntimeException("City not found"));
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}

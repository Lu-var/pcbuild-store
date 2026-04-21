package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.model.Region;
import cl.pcbuildstore.user.repository.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {

        this.regionRepository = regionRepository;
    }

    public Optional<Region> getRegionById(Long id) {
        return regionRepository.findById(id);
    }

    public Optional<Region> getRegionByName(String name) {
        return regionRepository.findByName(name);
    }

    public Map<Long, Region> getAllRegions() {
        Map<Long, Region> regionsMap = new HashMap<>();
        regionRepository.findAll().forEach(region -> regionsMap.put(region.getId(), region));
        return regionsMap;
    }

    public Region createRegion(Region region) {
        return regionRepository.save(region);
    }

    public Region updateRegion(Long id, Region regionDetails) {
        return regionRepository.findById(id)
                .map(region -> {
                    region.setName(regionDetails.getName());
                    return regionRepository.save(region);
                })
                .orElseThrow(() -> new RuntimeException("Region not found"));

    }

    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }
}

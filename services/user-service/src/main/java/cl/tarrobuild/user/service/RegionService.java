package cl.tarrobuild.user.service;

import cl.tarrobuild.user.dto.RegionDTO;
import cl.tarrobuild.user.model.Region;
import cl.tarrobuild.user.repository.RegionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {

        this.regionRepository = regionRepository;
    }

    public Optional<RegionDTO> getRegionById(Long id) {
        return regionRepository.findById(id)
                .map(RegionDTO::new);
    }

    public Optional<RegionDTO> getRegionByName(String name) {
        return regionRepository.findByName(name)
                .map(RegionDTO::new);
    }

    public List<RegionDTO> getAllRegions() {
        return regionRepository.findAll()
                .stream()
                .map(RegionDTO::new)
                .toList();
    }

    public RegionDTO createRegion(RegionDTO regionData) {
        Region newRegion = new Region();
        newRegion.setName(regionData.getName());
        Region saved = regionRepository.save(newRegion);
        return new RegionDTO(saved);
    }

    public RegionDTO updateRegion(Long id, RegionDTO regionData) {
        Region target = regionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Region not found"));
        target.setName(regionData.getName());
        Region saved = regionRepository.save(target);
        return new RegionDTO(saved);

    }

    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }
}

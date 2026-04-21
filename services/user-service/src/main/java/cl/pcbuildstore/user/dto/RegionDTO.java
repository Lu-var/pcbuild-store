package cl.pcbuildstore.user.dto;

import cl.pcbuildstore.user.model.Region;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegionDTO {

    private Long id;
    private String name;

    public RegionDTO(Region region) {
        this.id = region.getId();
        this.name = region.getName();
    }
}
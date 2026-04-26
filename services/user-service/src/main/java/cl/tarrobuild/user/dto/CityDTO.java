package cl.tarrobuild.user.dto;

import cl.tarrobuild.user.model.City;
import cl.tarrobuild.user.model.Region;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO {
    private Long id;
    private String name;
    private Long regionId;

    public CityDTO(City city) {
        this.id = city.getId();
        this.name = city.getName();
        this.regionId = Optional.ofNullable(city.getRegion())
            .map(Region::getId)
            .orElse(null);
    }
}

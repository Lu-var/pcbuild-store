package cl.pcbuildstore.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCityDTO {

    @NotBlank(message = "City name cannot be empty")
    @Size(min = 2, max = 100, message = "City name must be between 2 and 100 characters")
    private String name;

    @NotNull(message = "Region ID cannot be null")
    private Long regionId;
}

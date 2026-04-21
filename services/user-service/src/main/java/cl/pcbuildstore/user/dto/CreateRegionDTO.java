package cl.pcbuildstore.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateRegionDTO {

    @NotBlank(message = "Region name cannot be empty")
    @Size(min = 2, max = 100, message = "Region name must be between 2 and 100 characters")
    private String name;
}


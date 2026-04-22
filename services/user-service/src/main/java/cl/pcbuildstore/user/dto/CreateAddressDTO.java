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
public class CreateAddressDTO {

    @NotBlank(message = "Street cannot be empty")
    @Size(min = 5, max = 200, message = "Street must be between 5 and 200 characters")
    private String street;

    @NotBlank(message = "Postal code cannot be empty")
    @Size(min = 4, max = 20, message = "Postal code must be between 4 and 20 characters")
    private String postalCode;

    @NotNull(message = "City ID cannot be null")
    private Long cityId;

    @NotNull(message = "isPrimary cannot be null")
    private Boolean isPrimary;
}

package cl.pcbuildstore.user.dto;

import cl.pcbuildstore.user.model.Address;
import cl.pcbuildstore.user.model.City;
import cl.pcbuildstore.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {
    private Long id;
    private String street;
    private String postalCode;
    private Boolean isPrimary;
    private Long userId;
    private Long cityId;

    public AddressDTO(Address address) {
        this.id = address.getId();
        this.street = address.getStreet();
        this.postalCode = address.getPostalCode();
        this.isPrimary = address.getIsPrimary();

        this.userId = Optional.ofNullable(address.getUser())
                .map(User::getId)
                .orElse(null);

        this.cityId = Optional.ofNullable(address.getCity())
                .map(City::getId)
                .orElse(null);
    }
}

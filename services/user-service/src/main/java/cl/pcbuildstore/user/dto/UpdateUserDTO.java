package cl.pcbuildstore.user.dto;

import cl.pcbuildstore.user.model.User;

public class UpdateUserDTO {
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public UpdateUserDTO(User user) {
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
    }
}

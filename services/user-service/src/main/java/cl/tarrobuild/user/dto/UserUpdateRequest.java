package cl.tarrobuild.user.dto;

import cl.tarrobuild.user.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
    private String name;
    private String lastName;
    private String phone;

    public UserUpdateRequest(User user) {
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.phone = user.getPhone();
    }
}

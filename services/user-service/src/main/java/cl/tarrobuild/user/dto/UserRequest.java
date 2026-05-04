package cl.tarrobuild.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    String name,

    @NotBlank(message = "Last name cannot be empty")
    @Size(min = 2, max = 100, message = "Last name must be between 2 and 100 characters")
    String lastName,

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Email must be valid")
    String email,

    @NotBlank(message = "Phone cannot be empty")
    @Size(min = 8, max = 20, message = "Phone must be between 8 and 20 characters")
    String phone
) {}

package cl.tarrobuild.category.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CategoryRequest(
        @NotBlank(message = "Name cannot be blank")
        @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
        String name,

        @NotBlank
        @Size(min = 2, max = 100, message = "Slug must be between 2 and 100 characters")
        @Pattern(
                regexp = "^[a-z0-9-]+$",
                message = "Slug can only contain lowercase letters, numbers and hyphens"
        )
        String slug,

        @Size(max = 500, message = "Description cannot exceed 500 characters")
        String description,

        Boolean isActive
) {}

package cl.tarrobuild.category.dto;

import cl.tarrobuild.category.model.AttributeValueType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AttributeDefinitionRequest(
        @NotBlank(message = "Attribute name cannot be blank")
        @Size(min = 2, max = 100, message = "Attribute name must be between 2 and 100 characters")
        String attributeName,

        @NotNull(message = "Value type cannot be null")
        AttributeValueType valueType,

        @NotNull(message = "isRequired cannot be null")
        Boolean isRequired
) {}

package cl.tarrobuild.build.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record BuildItemRequest(
        @NotNull(message = "Product ID cannot be null")
        Long productId,

        @NotNull(message = "Quantity cannot be null")
        @Size(min = 1, message = "Quantity must be at least 1")
        Integer quantity
) {

}

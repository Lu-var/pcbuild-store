package cl.tarrobuild.build.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record BuildItemRequest(
        @NotNull(message = "Product ID cannot be null")
        Long productId,

        @NotNull(message = "Quantity cannot be null")
        Integer quantity
) {

}

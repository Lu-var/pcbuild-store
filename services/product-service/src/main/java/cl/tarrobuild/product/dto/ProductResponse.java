package cl.tarrobuild.product.dto;

import java.util.List;

public record ProductResponse(
        Long id,
        String name,
        String description,
        int price,
        Long categoryId,
        String brand,
        String model,
        boolean isActive,
        List<ProductAttributeResponse> attributes
) {}

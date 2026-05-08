package cl.tarrobuild.category.dto;

import java.util.List;

public record CategoryResponse(
        Long id,
        String name,
        String slug,
        String description,
        Boolean isActive,
        List<AttributeDefinitionResponse> attributes
) {}

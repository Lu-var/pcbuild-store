package cl.tarrobuild.category.dto;

import cl.tarrobuild.category.model.AttributeValueType;

public record AttributeDefinitionResponse(
        Long id,
        String attributeName,
        AttributeValueType valueType,
        Boolean isRequired,
        Long categoryId

) {}

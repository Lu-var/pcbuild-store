package cl.tarrobuild.build.dto;

public record BuildItemResponse(
        Long id,
        Long buildId,
        Long productId,
        Integer quantity
) {}

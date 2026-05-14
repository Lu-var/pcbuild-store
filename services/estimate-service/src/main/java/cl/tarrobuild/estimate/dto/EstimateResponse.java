package cl.tarrobuild.estimate.dto;

import java.time.LocalDateTime;

public record EstimateResponse(
        Long id,
        Long buildId,
        Integer totalPrice,
        String currency,
        LocalDateTime createdAt
) {}

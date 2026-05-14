package cl.tarrobuild.product.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

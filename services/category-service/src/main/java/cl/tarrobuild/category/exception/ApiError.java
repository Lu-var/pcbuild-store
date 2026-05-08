package cl.tarrobuild.category.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

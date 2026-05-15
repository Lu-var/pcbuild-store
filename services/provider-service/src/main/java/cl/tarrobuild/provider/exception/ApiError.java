package cl.tarrobuild.provider.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

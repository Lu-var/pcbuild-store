package cl.tarrobuild.build.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}


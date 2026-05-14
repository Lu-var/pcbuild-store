package cl.tarrobuild.user.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

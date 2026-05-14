package cl.tarrobuild.notification.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

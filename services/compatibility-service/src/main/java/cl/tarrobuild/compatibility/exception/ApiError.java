package cl.tarrobuild.compatibility.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

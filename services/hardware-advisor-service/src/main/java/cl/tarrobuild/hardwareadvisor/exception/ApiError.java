package cl.tarrobuild.hardwareadvisor.exception;

public record ApiError(
        String message,
        String details,
        String timestamp
) {}

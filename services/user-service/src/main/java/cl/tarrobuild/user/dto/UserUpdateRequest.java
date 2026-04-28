package cl.tarrobuild.user.dto;

public record UserUpdateRequest(
        String name,
        String lastName,
        String phone
) {}

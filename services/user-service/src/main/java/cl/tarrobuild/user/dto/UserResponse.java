package cl.tarrobuild.user.dto;

import cl.tarrobuild.user.model.User;
import java.time.LocalDateTime;

public record UserResponse(
        Long id,
        String name,
        String lastName,
        String email,
        String phone,
        LocalDateTime createdAt
) {}

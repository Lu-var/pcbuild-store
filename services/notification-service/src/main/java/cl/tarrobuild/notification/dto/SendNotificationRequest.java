package cl.tarrobuild.notification.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SendNotificationRequest(
        @NotNull(message = "User ID cannot be null")
        Long userId,

        @NotBlank(message = "Type cannot be blank")
        String type,

        @NotBlank(message = "Content cannot be blank")
        String content
) {}

package cl.tarrobuild.build.dto;

import java.time.LocalDateTime;
import java.util.List;

public record BuildResponse(
        Long id,
        Long userId,
        String name,
        String status,
        LocalDateTime createdAt,
        List<BuildItemResponse> items
) {}

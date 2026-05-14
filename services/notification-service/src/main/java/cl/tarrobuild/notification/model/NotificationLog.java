package cl.tarrobuild.notification.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationLog {

    private Long id;
    private Long userId;
    private String type;
    private String content;
    private NotificationStatus status;
    private LocalDateTime timestamp;
}

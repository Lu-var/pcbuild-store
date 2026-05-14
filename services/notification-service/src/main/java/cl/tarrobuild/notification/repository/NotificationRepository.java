package cl.tarrobuild.notification.repository;

import cl.tarrobuild.notification.model.NotificationLog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class NotificationRepository {

    private final Map<Long, NotificationLog> store = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public NotificationLog save(NotificationLog log) {
        if (log.getId() == null) {
            log.setId(idCounter.getAndIncrement());
        }
        store.put(log.getId(), log);
        return log;
    }

    public List<NotificationLog> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<NotificationLog> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<NotificationLog> findByUserId(Long userId) {
        return store.values().stream()
                .filter(log -> userId.equals(log.getUserId()))
                .toList();
    }
}

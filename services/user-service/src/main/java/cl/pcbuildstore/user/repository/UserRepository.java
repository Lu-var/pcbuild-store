package cl.pcbuildstore.user.repository;

import cl.pcbuildstore.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByLastName(String lastName);
    Optional<User> findByNameAndLastName(String name, String lastName);

    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);

    boolean existsByEmail(String email);
    long countByName(String name);
}

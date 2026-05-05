package cl.tarrobuild.user.service;

import cl.tarrobuild.user.dto.UserRequest;
import cl.tarrobuild.user.dto.UserUpdateRequest;
import cl.tarrobuild.user.dto.UserResponse;
import cl.tarrobuild.user.model.User;
import cl.tarrobuild.user.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserResponse toResponse(User user){
        return new UserResponse(
                user.getId(), user.getName(), user.getLastName(),
                user.getEmail(), user.getPhone(), user.getCreatedAt());
    }

    public UserResponse getUserById(Long id) {
        return userRepository
                .findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("User with ID " + id + " not found"));
    }

    public List<UserResponse> getUsers(String name, String lastName){
        List<User> users;
        if (name != null && lastName != null){
            users = userRepository.findByNameAndLastName(name, lastName);
        } else if (name != null) {
            users = userRepository.findByName(name);
        } else if (lastName != null) {
             users = userRepository.findByLastName(lastName);
        } else {
            users = userRepository.findAll();
        }

        return users.stream()
                .map(this::toResponse)
                .toList();
    }

    public UserResponse getUserByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("User with email " + email + " not found"));
    }

    public UserResponse getUserByPhone(String phone) {
        return userRepository
                .findByPhone(phone)
                .map(this::toResponse)
                .orElseThrow(() -> new EntityNotFoundException("User with phone " + phone + " not found"));
    }

    public UserResponse createUser(UserRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("Email: \"" + request.email() + "\" already exists");
        }
        User user = new User();
        user.setName(request.name());
        user.setLastName(request.lastName());
        user.setEmail(request.email());
        user.setPhone(request.phone());
        user.setCreatedAt(LocalDateTime.now());
        User saved = userRepository.save(user);

        return this.toResponse(saved);
    }

    public UserResponse updateUser(Long id, UserUpdateRequest userData) {
        return userRepository.findById(id)
                .map(user ->{
                    user.setName(userData.name());
                    user.setLastName(userData.lastName());
                    user.setPhone(userData.phone());
                    User saved = userRepository.save(user);
                    return toResponse(saved);
                })
                .orElseThrow(() -> new EntityNotFoundException("User with ID " + id + " not found"));
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new EntityNotFoundException("User with ID " + id + " not found");
        }
        userRepository.deleteById(id);
    }
}

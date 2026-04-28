package cl.tarrobuild.user.service;

import cl.tarrobuild.user.dto.UserRequest;
import cl.tarrobuild.user.dto.UserUpdateRequest;
import cl.tarrobuild.user.dto.UserResponse;
import cl.tarrobuild.user.model.User;
import cl.tarrobuild.user.repository.UserRepository;
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

    public Optional<UserResponse> getUserById(Long id) {
        return userRepository
                .findById(id)
                .map(this::toResponse);
    }

    public Optional<UserResponse> getUserByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .map(this::toResponse);
    }

    public Optional<UserResponse> getUserByPhone(String phone) {
        return userRepository
                .findByPhone(phone)
                .map(this::toResponse);
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public UserResponse createUser(UserRequest createDTO) {
        User user = new User();
        user.setName(createDTO.getName());
        user.setLastName(createDTO.getLastName());
        user.setEmail(createDTO.getEmail());
        user.setPhone(createDTO.getPhone());

        user.setCreatedAt(LocalDateTime.now());

        User saved = userRepository.save(user);

        return this.toResponse(saved);
    }

    public Optional<UserResponse> updateUser(Long id, UserUpdateRequest userData) {
        return userRepository.findById(id)
        .map(user ->{
           user.setName(userData.name());
           user.setLastName(userData.lastName());
           user.setPhone(userData.phone());
           return toResponse(user);
        });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

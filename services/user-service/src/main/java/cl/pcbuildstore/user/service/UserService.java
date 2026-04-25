package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.dto.UserRequest;
import cl.pcbuildstore.user.dto.UserUpdateRequest;
import cl.pcbuildstore.user.dto.UserResponse;
import cl.pcbuildstore.user.model.User;
import cl.pcbuildstore.user.repository.UserRepository;
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

    public Optional<UserResponse> getUserById(Long id) {
        return userRepository
                .findById(id)
                .map(UserResponse::new);
    }

    public Optional<UserResponse> getUserByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .map(UserResponse::new);
    }

    public Optional<UserResponse> getUserByPhone(String phone) {
        return userRepository
                .findByPhone(phone)
                .map(UserResponse::new);
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserResponse::new)
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

        return new UserResponse(saved);
    }

    public Optional<UserResponse> updateUser(Long id, UserUpdateRequest userData) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(userData.getName());
                    user.setLastName(userData.getLastName());
                    user.setPhone(userData.getPhone());
                    User saved = userRepository.save(user);
                    return new UserResponse(saved);
                });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

package cl.pcbuildstore.user.service;

import cl.pcbuildstore.user.dto.UpdateUserDTO;
import cl.pcbuildstore.user.dto.UserDTO;
import cl.pcbuildstore.user.model.User;
import cl.pcbuildstore.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserDTO> getUserById(Long id) {
        return userRepository
                .findById(id)
                .map(UserDTO::new);
    }

    public Optional<UserDTO> getUserByEmail(String email) {
        return userRepository
                .findByEmail(email)
                .map(UserDTO::new);
    }

    public Optional<UserDTO> getUserByPhone(String phone) {
        return userRepository
                .findByPhone(phone)
                .map(UserDTO::new);
    }

    public Map<Long, UserDTO> getAllUsers() {
        Map<Long, UserDTO> usersMap = new HashMap<>();
        userRepository.findAll()
                .forEach(user -> usersMap.put(user.getId(), new UserDTO(user)));
        return usersMap;
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());

        user.setCreatedAt(LocalDateTime.now());

        User saved = userRepository.save(user);

        return new UserDTO(saved);
    }

    public Optional<UserDTO> updateUser(Long id, UpdateUserDTO userData) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(userData.getName());
                    user.setLastName(userData.getLastName());
                    user.setPhone(userData.getPhone());
                    User saved = userRepository.save(user);
                    return new UserDTO(saved);
                });
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

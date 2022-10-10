package com.example.userservice.user;

import com.example.userservice.user.dto.UserCreateDto;
import com.example.userservice.user.dto.UserDto;
import com.example.userservice.user.dto.UserLoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:40 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserValidator userValidator;
    private final PasswordEncoder encoder;

    public UserDto register(UserCreateDto userCreateDto) {
        userValidator.validateOnCreate(userCreateDto);
        Optional<UserEntity> userByEmail = userRepository.findByEmail(userCreateDto.getEmail());
        if (userByEmail.isPresent())
            throw new RuntimeException("user already exists by email " + userCreateDto.getEmail());
        UserEntity user = userMapper.fromCreateDto(userCreateDto);
        user.setPassword(encoder.encode(userCreateDto.getPassword()));
        return userMapper.fromUser(userRepository.save(user));
    }

    public UserDto login(UserLoginDto userLoginDto) {
        Optional<UserEntity> byEmail = userRepository.findByEmail(userLoginDto.getEmail());
        UserEntity user = byEmail.orElseThrow(() -> new RuntimeException("Bad credentials"));
        boolean passwordMatches = encoder.matches(userLoginDto.getPassword(), user.getPassword());
        if (!passwordMatches)
            throw new RuntimeException("Bad credentials");

        return userMapper.fromUser(user);
    }

    public Boolean checkActive(Long id) {
        return userRepository.findById(id).isPresent();
    }
}

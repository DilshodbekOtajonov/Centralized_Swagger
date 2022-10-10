package com.example.userservice.user;

import com.example.userservice.user.dto.UserCreateDto;
import org.springframework.stereotype.Component;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:41 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@Component
public class UserValidator {
    public void validateOnCreate(UserCreateDto userCreateDto) {
        if (userCreateDto.getEmail().isBlank()) {
            throw new RuntimeException("email can not be blank");
        }
        if (userCreateDto.getPassword().isBlank()) {
            throw new RuntimeException("password can not be blank");
        }
    }
}

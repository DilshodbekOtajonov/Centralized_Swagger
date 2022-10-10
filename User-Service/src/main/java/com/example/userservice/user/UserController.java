package com.example.userservice.user;

import com.example.userservice.user.dto.UserCreateDto;
import com.example.userservice.user.dto.UserDto;
import com.example.userservice.user.dto.UserLoginDto;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:39 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@RestController
@RequestMapping("/app/v3/user")
@RequiredArgsConstructor
@Timed
@CrossOrigin(origins = "http://localhost:9091")
public class UserController {
    private final UserService userService;

    @PutMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserCreateDto userCreateDto) {
        UserDto userDto = userService.register(userCreateDto);
        return new ResponseEntity(userDto, HttpStatus.CREATED);
    }

    @PutMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserLoginDto userLoginDto) {
        UserDto userDto = userService.login(userLoginDto);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @GetMapping("/isActive/{id}")
    public Boolean checkActive(@PathVariable Long id) {
        return userService.checkActive(id);
    }


}

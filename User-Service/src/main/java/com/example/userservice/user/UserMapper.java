package com.example.userservice.user;

import com.example.userservice.user.dto.UserCreateDto;
import com.example.userservice.user.dto.UserDto;
import org.mapstruct.Mapper;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:57 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity fromCreateDto(UserCreateDto userCreateDto);

    UserDto fromUser(UserEntity save);
}

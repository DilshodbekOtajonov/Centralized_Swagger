package com.example.userservice.user.dto;

import lombok.*;

import javax.persistence.Column;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:53 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserCreateDto {
    private String name;
    private String surname;
    private String password;
    private String email;
    private String address;
}

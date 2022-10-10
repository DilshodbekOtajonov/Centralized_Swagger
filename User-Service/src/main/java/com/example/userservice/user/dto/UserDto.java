package com.example.userservice.user.dto;

import lombok.*;

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
public class UserDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String address;
}

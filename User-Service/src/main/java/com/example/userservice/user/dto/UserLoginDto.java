package com.example.userservice.user.dto;

import lombok.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:58 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserLoginDto {
    private String password;
    private String email;

}

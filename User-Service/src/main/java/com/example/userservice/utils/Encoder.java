package com.example.userservice.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 6:13 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@Configuration
public class Encoder {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

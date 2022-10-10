package com.example.userservice.user;

import lombok.*;

import javax.persistence.*;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:40 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @Column(nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String email;
    private String address;
}

package com.example.userservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author "Otajonov Dilshodbek
 * @since 9/30/22 5:40 PM (Friday)
 * OnlineStoreMicroservices/IntelliJ IDEA
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}

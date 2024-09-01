package com.petals.fashions.petalscrm.repositories;

import com.petals.fashions.petalscrm.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
}

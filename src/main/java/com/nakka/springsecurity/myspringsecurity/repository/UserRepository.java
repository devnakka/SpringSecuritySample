package com.nakka.springsecurity.myspringsecurity.repository;

import com.nakka.springsecurity.myspringsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Srikanth Nakka on 10/12/2018
 * @project myspringsecurity
 */
public interface UserRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByName(String username);
}

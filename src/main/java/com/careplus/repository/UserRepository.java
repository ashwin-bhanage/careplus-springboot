package com.careplus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careplus.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);
}
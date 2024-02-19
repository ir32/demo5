package com.example5.demo5.repository;

import com.example5.demo5.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

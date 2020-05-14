package com.springapp.springapp.repository;

import com.springapp.springapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
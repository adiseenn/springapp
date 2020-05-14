package com.springapp.springapp.repository;

import com.springapp.springapp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}

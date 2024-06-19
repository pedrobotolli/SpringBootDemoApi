package com.springboot.pedrobotolli.DemoApiSQL.repository;

import com.springboot.pedrobotolli.DemoApiSQL.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}

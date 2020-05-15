package com.benetijpa.project.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benetijpa.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

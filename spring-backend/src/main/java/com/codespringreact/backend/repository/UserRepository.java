package com.codespringreact.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codespringreact.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

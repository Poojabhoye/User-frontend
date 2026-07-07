package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

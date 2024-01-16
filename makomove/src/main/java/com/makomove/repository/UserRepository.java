package com.makomove.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makomove.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.gabrielrohden.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielrohden.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

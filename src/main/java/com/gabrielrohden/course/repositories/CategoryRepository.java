package com.gabrielrohden.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielrohden.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

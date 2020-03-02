package com.gabrielrohden.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielrohden.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

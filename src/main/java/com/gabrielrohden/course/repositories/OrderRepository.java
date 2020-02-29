package com.gabrielrohden.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielrohden.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

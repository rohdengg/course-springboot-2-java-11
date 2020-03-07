package com.gabrielrohden.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielrohden.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

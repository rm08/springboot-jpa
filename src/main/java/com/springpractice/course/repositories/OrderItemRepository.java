package com.springpractice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpractice.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

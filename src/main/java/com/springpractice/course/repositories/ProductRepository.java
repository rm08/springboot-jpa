package com.springpractice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpractice.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

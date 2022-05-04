package com.springpractice.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpractice.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

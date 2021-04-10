package com.matkabal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matkabal.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

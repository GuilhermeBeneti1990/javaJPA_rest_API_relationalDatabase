package com.benetijpa.project.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benetijpa.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

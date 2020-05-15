package com.benetijpa.project.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benetijpa.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

package com.benetijpa.project.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benetijpa.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

package com.benetijpa.project.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benetijpa.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

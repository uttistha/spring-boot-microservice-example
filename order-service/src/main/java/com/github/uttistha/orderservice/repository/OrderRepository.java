package com.github.uttistha.orderservice.repository;

import com.github.uttistha.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

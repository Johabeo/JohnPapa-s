package com.example.demo.repo;

import com.example.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Integer> {

    List<Order> getOrderByOrderStatus(String orderStatus);
}

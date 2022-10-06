package com.example.demo.service;

import com.example.demo.entities.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Order getOrderById(int orderId);
    List<Order> getOrderByOrderStatus(String orderStatus);
    List<Order> getOrderByUserId(int userId);
    Order addOrder(Order order);
}

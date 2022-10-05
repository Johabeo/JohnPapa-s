package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Order getOrderbyId(int orderId);
    Order getOrderbyUserId(int userId);
    Order addOrder(Order order);
}

package com.example.demo.service;

import com.example.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Order getOrderById(int orderId);
}

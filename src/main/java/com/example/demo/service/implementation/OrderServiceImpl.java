package com.example.demo.service.implementation;

import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Order addOrder(Order order) {return orderRepository.save(order);}

    @Override
    public Order getOrderByUserId(int userId) { return userRepository.findByOrderByUserId(UserId);}

    @Override
    public Order getOrderById(int orderId) { return orderRepository.findByOrderId(orderId);}
}

package com.example.demo.service.implementation;

import com.example.demo.entities.Order;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.OrderRepo;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private CustomerRepo customerRepository;

    @Override
    public Order addOrder(Order order) {return orderRepository.save(order);}

    @Override
    public List<Order> getOrderByStatus(String status) {
        return orderRepository.getOrderByOrderStatus(status);
    }

    @Override
    public List<Order> getOrderByUserId(int userId) { return orderRepository.getOrderByCustomerId(userId);}

    @Override
    public Order getOrderById(int orderId) { return orderRepository.findById(orderId).get();}
}

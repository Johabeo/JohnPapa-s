package com.example.demo.service.implementation;

import com.example.demo.entities.Order;
import com.example.demo.repo.OrderRepo;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order addOrder(Order order) {return orderRepo.save(order);}

    @Override
    public List<Order> getOrderByOrderStatus(String orderStatus){ return orderRepo.getOrderByOrderStatus(orderStatus);}

    @Override
    public Order getOrderById(int orderId) { return orderRepo.getReferenceById(orderId);}
}

package com.example.demo.controllers;

import com.example.demo.entities.Order;
import com.example.demo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/add")
    public ResponseEntity<Order> addOrder(@RequestBody Order newOrder){
        Order returnOrder = orderService.addOrder(newOrder);
        return new ResponseEntity<Order>(returnOrder, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") int id){
        Order order = orderService.getOrderById(id);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }

    @GetMapping("/status")
    public ResponseEntity<List<Order>> getOrderByStatus(@PathVariable("status") String status) {
        List<Order> orders = orderService.getOrderByOrderStatus(status);
        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }

    @GetMapping("/byCustomer/{userid}")
    public  ResponseEntity<List<Order>> getOrderByUserId(@PathVariable("userid") int userId) {
        List<Order> orders = orderService.getOrderByUserId(userId);
        return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
    }


}

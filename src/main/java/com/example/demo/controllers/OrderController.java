package com.example.demo.controllers;

import com.example.demo.service.OrderService;
import org.hibernate.criterion.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Order> getOrderById(@PathVariable("id") String id){
        Order order = orderService.getOrderById(id);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }

    @GetMapping("/status")
    public ResponseEntity<Order> getOrderByStatus(@PathVariable("status") String status) {
        Order order = orderService.getOrderByStatus(status);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }

    @GetMapping("/userid")
    public  ResponseEntity<Order> getOrderByUserId(@PathVariable("userid") String userId) {
        Order order = orderService.getOrderByUserId(userId);
        return new ResponseEntity<Order>(order, HttpStatus.OK);
    }


}

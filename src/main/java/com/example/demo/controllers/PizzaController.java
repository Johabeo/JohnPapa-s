package com.example.demo.controllers;

import com.example.demo.service.OrderService;
import com.example.demo.service.PizzaService;
import org.hibernate.criterion.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/{id}")
    public RequestEntity<Pizza> getPizzaById(@PathVariable("id") String id) {
        Pizza pizza = pizzaService.getPizzaById(id);
        return new ResponseEntity<Order>(pizza, HttpStatus.OK);
    }
}

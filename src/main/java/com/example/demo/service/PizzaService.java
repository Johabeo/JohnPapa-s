package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaService {
    Pizza getPizzabyId(long pizzaId);
}

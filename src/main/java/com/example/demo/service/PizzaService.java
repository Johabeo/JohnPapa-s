package com.example.demo.service;

import com.example.demo.entities.Pizza;
import org.springframework.stereotype.Service;

@Service
public interface PizzaService {
    Pizza getPizzaById(int pizzaId);
}

package com.example.demo.service;

import com.example.demo.entities.Pizza;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaService {

    Pizza getPizzabyId(int pizzaId);
}

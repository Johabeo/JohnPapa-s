package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface PizzaService {
    Pizza getPizzabyId(long pizza);
}

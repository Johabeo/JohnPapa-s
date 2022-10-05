package com.example.demo.service.implementation;

import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class PizzaServiceImpl implements AdminService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public Pizza getPizzaById(long pizza) { return pizzaRepository.findByPizzaId(pizzaId);}
}

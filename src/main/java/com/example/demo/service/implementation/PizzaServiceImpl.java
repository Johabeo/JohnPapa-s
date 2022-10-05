package com.example.demo.service.implementation;

import com.example.demo.entities.Pizza;
import com.example.demo.repo.PizzaRepo;
import com.example.demo.service.AdminService;
import com.example.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;

public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepo pizzaRepository;

    @Override
    public Pizza getPizzaById(int pizzaId) { return pizzaRepository.getReferenceById(pizzaId);}

}

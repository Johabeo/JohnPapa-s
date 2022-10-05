package com.example.demo.service.implementation;

import com.example.demo.service.AdminService;
import com.example.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public Pizza getPizzaById(long pizzaId) { return pizzaRepository.findByPizzaId(pizzaId);}
}

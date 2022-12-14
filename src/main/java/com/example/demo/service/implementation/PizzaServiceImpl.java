package com.example.demo.service.implementation;

import com.example.demo.entities.Pizza;
import com.example.demo.repo.PizzaRepo;
import com.example.demo.service.AdminService;
import com.example.demo.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepo pizzaRepo;

    @Override
    public Pizza getPizzaById(int pizzaId) { return pizzaRepo.getReferenceById(pizzaId);}
}

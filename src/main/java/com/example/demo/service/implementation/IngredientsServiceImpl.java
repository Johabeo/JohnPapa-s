package com.example.demo.service.implementation;

import com.example.demo.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    @Override
    public Ingredients getIngredientsById(int ingredientsId) { return ingredientsRepository.findByIngredientsId(ingredientsId);}
}

package com.example.demo.service.implementation;

import com.example.demo.entities.Ingredient;
import com.example.demo.repo.IngredientRepo;
import com.example.demo.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsServiceImpl implements IngredientsService {

    @Autowired
    private IngredientRepo ingredientsRepository;

    @Override
    public Ingredient getIngredientById(int ingredientsId) { return ingredientsRepository.findById(ingredientsId).get();}

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientsRepository.save(ingredient);
    }
}

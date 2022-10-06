package com.example.demo.service.implementation;

import com.example.demo.entities.Ingredient;
import com.example.demo.repo.IngredientRepo;
import com.example.demo.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepo ingredientRepo;

    @Override
    public Ingredient getIngredientById(int ingredientId) { return ingredientRepo.getReferenceById(ingredientId);}

    @Override
    public Ingredient addIngredient(Ingredient ingredient) { return ingredientRepo.save(ingredient);}
}

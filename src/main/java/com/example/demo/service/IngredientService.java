package com.example.demo.service;

import com.example.demo.entities.Ingredient;
import org.springframework.stereotype.Service;

@Service
public interface IngredientService {
    Ingredient getIngredientById(int ingredientId);

    Ingredient addIngredient(Ingredient ingredient);
}

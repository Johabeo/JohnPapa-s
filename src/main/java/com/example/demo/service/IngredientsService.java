package com.example.demo.service;

import com.example.demo.entities.Ingredient;
import org.springframework.stereotype.Service;

@Service
public interface IngredientsService {
    Ingredient getIngredientById(int ingredientId);

    Ingredient addIngredients(Ingredient ingredient);
}

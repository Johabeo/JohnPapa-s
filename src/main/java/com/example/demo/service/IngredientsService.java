package com.example.demo.service;

import com.example.demo.entities.Ingredient;
import org.springframework.stereotype.Service;

@Service
public interface IngredientsService {
    Ingredients getIngredientbyId(int ingredientId);

    Ingredients addIngredients(Ingredients ingredients);
}

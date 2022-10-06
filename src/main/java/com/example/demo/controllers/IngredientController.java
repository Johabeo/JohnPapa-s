package com.example.demo.controllers;

import com.example.demo.entities.Ingredient;
import com.example.demo.service.IngredientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientsService;

    public IngredientController(IngredientService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Ingredient> getIngredientById(@PathVariable("id") int id) {
        Ingredient ingredient = ingredientsService.getIngredientById(id);
        return new ResponseEntity<Ingredient>(ingredient, HttpStatus.OK);
    }
}

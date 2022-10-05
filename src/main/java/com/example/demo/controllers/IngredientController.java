package com.example.demo.controllers;

import org.hibernate.criterion.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    @RequestMapping("/{id}")
    public RequestEntity<ingredient> getIngredientById(@PathVariable("id") String id) {
        Ingredient ingredient = ingredientService.getIngredientById(id);
        return new ResponseEntity<Ingredient>(ingredient, HttpStatus.OK);
    }
}

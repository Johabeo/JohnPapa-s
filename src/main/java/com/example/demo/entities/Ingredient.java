package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ingredientId;
    private String ingredientName;
    private int stockAmount;
    private double ingredientPrice;

    @ManyToMany(mappedBy = "ingredients")
    Set<Pizza> pizzas;
}

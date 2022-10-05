package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pizzaId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "size")
    private SizePrice size;

    @ManyToMany(mappedBy = "orderPizzas")
    Set<Order> pizzaOrders;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "pizza_ingredients",
            joinColumns = @JoinColumn(name = "ingredientId"),
            inverseJoinColumns = @JoinColumn(name = "pizzaId")
    )
    Set<Ingredient> ingredients;
}

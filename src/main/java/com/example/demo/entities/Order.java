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
@Table(name = "Pizza_Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private int customerId;
    private String orderStatus;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "order_pizzas",
            joinColumns = @JoinColumn(name = "pizzaId"),
            inverseJoinColumns = @JoinColumn(name = "orderId")
    )
    Set<Pizza> orderPizzas;
}

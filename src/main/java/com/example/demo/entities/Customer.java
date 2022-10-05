package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerEmail;
    private String customerPassword;
    private String customerFirstName;
    private String customerLastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address customerAddress;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "creditCardId")
    private CreditCard customerCreditCard;
}

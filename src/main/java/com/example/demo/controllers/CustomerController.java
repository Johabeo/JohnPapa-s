package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    //Add customer service
//    private final CustomerService customerService;
    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer newCustomer){
        Customer returnCustomer = customerService.addCustomer(newCustomer);
        return new ResponseEntity<Customer>(returnCustomer, HttpStatus.CREATED);
    }


}

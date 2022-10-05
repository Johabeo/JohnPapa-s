package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String id){
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}

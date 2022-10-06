package com.example.demo.controllers;

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer newCustomer){
        Customer returnCustomer = customerService.addCustomer(newCustomer);
        return new ResponseEntity<Customer>(returnCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id){
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}

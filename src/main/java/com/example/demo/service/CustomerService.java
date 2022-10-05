package com.example.demo.service;

import com.example.demo.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer getCustomerById(int customerId);
}

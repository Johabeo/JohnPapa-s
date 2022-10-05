package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer getCustomerbyId(int customerId);

    Customer addCustomer(Customer customer);
}

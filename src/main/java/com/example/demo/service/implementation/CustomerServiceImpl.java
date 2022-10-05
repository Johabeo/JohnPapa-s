package com.example.demo.service.implementation;

import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {return customerRepository.save(customer);}

    @Override
    public Customer getCustomerById(long customerId) { return customerRepository.findByCustomerId(customerId);}
}

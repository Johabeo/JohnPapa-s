package com.example.demo.service.implementation;

import com.example.demo.entities.Customer;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {return customerRepository.save(customer);}

    @Override
    public Customer getCustomerById(int customerId) { return customerRepository.findById(customerId).get();}
}

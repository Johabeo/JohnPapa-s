package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    //Add Admin service
//    private final CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") String id){
        Admin admin = adminService.getAdminById(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}

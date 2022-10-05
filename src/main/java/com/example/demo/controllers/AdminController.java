package com.example.demo.controllers;

import com.example.demo.service.AdminService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService AdminService) {
        this.adminService = adminService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") String id){
        Admin admin = adminService.getAdminById(id);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }
}

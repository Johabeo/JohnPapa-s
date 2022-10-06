package com.example.demo.controllers;

import com.example.demo.entities.Admin;
import com.example.demo.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {this.adminService = adminService;}


    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("id") int id){
        Admin admin = adminService.getAdminById(id);
        return new ResponseEntity<Admin>(admin, HttpStatus.OK);
    }
}

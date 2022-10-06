package com.example.demo.service.implementation;

import com.example.demo.entities.Admin;
import com.example.demo.repo.AdminRepo;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;

    @Override
    public Admin getAdminById(int adminId) { return adminRepo.getReferenceById(adminId);}
}

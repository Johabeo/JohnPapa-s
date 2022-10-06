package com.example.demo.service;

import com.example.demo.entities.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    Admin getAdminbyId(int adminId);
}

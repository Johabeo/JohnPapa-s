package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin getAdminbyId(long adminId);
}

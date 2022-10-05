package com.example.demo.repo;

import com.example.demo.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}

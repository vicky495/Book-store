package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
private final StudentRepository repository;
public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
public student saveStudent(student student) {
        return repository.save(student);
    }

    public List<student> getAllStudents() {
        return repository.findAll();
    }
}

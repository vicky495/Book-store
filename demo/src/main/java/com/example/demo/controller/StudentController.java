package com.example.demo.controller;

import com.example.demo.entity.student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public student addStudent(@RequestBody student student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<student> getStudents() {
        return service.getAllStudents();
    }
}
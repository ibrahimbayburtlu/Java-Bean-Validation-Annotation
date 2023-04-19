package com.ibrahimbayburtlu.springjavabeanvalidation.controller;

import com.ibrahimbayburtlu.springjavabeanvalidation.Model.Student;
import com.ibrahimbayburtlu.springjavabeanvalidation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    ResponseEntity<String> addStudent(@Valid @RequestBody Student student){
        studentService.save(student);
        return ResponseEntity.ok("Student Saved");
    }
}

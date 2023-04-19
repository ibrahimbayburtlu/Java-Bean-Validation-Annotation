package com.ibrahimbayburtlu.springjavabeanvalidation.service;


import com.ibrahimbayburtlu.springjavabeanvalidation.Model.Student;
import com.ibrahimbayburtlu.springjavabeanvalidation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public void save(Student student){
        studentRepository.save(student);
    }
}

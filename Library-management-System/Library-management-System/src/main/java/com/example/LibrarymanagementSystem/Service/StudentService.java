package com.example.LibrarymanagementSystem.Service;

import com.example.LibrarymanagementSystem.Entites.Student;
import com.example.LibrarymanagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(Student student){

        studentRepository.save(student);

        return "Student has been saved to the Database";

    }
}

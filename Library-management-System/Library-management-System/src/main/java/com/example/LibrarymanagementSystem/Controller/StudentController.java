package com.example.LibrarymanagementSystem.Controller;

import com.example.LibrarymanagementSystem.Entites.Student;
import com.example.LibrarymanagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public String addStudent (@RequestBody Student student){

        return studentService.addStudent(student);

    }
}

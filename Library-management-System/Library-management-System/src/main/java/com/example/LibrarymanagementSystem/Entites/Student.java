package com.example.LibrarymanagementSystem.Entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity// This means it is a structure that will be reflected in database
@Table(name="student")// This class will have a table whose name is student
@Getter
@Setter
@AllArgsConstructor //Constructor for all Arguments in the table
@NoArgsConstructor //Constructor for no arguments in the table ----Student(){}

public class Student {
    @Id // it is an primary key
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentid; // this will behave like primary key
    private String name;
    private  int age;
    @Column(name = "ContactNo",unique = true,nullable = false) // it is used o change colounm name ,unique menas it should be unique,coloum should not be null (nullable)
    private String mobno;
    private  String emailid;
    private String bloodgroup;

    // using bidirection mapping
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Librarycard librarycard;


}

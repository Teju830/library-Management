package com.example.LibrarymanagementSystem.Repository;

import com.example.LibrarymanagementSystem.Entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> { //JpaRepository is a funtion that calls basic curd quaries
                                                                            //<student is entity ,integer is primary key datatype>

}

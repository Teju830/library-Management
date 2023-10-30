package com.example.LibrarymanagementSystem.Repository;

import com.example.LibrarymanagementSystem.Entites.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

}

package com.example.LibrarymanagementSystem.Repository;

import com.example.LibrarymanagementSystem.Entites.Librarycard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Librarycard,Integer> {
}

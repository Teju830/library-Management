package com.example.LibrarymanagementSystem.Controller;

import com.example.LibrarymanagementSystem.Entites.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/addBook")
    public ResponseEntity addBook(@RequestBody Book book, @RequestParam("authorId") Integer authorId){
 return null;
    }
}

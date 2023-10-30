package com.example.LibrarymanagementSystem.Controller;

import com.example.LibrarymanagementSystem.Entites.Author;
import com.example.LibrarymanagementSystem.Service.Authorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class Authorcontroller {
    @Autowired
    private Authorservice authorservice;
    @PostMapping("/add")
    public ResponseEntity<String> addAuthor(@RequestBody Author author){

        String result = authorservice.addAuthor(author);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }
    @GetMapping("/findAllAuthorNames")
    public List<String> getAllAuthorNames(){

        return authorservice.getAllAuthorNames();

    }


    @GetMapping("/getAuthor/{id}")
    public ResponseEntity  getAuthor(@PathVariable("id")Integer id){
              try{
            Author author = authorservice.getAuthorById(id);
            return new ResponseEntity<>(author,HttpStatus.OK);
              }catch (Exception e) {
                  return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
              }
    }
    }


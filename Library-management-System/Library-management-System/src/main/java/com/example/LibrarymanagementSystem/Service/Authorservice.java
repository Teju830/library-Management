package com.example.LibrarymanagementSystem.Service;

import com.example.LibrarymanagementSystem.Entites.Author;
import com.example.LibrarymanagementSystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


    @Service
    public class Authorservice {

        @Autowired
        private AuthorRepository authorRepository;

        public String addAuthor(Author author){

            authorRepository.save(author);
            return "Author has been added to the Database";


        }
        public List<String> getAllAuthorNames(){

            List<Author> authors = authorRepository.findAll();

            List<String> authorNames = new ArrayList<>();

            for(Author author: authors){
                authorNames.add(author.getAuthorName());
            }
            return authorNames;

        }
   public Author getAuthorById(Integer id) throws Exception{
       Optional<Author>optionalAuthor=authorRepository.findById(id); //for findbyid the return type is optional which means when author present it will return author otherwise it will return null
        // if we not write optional class then we get null point exception when author not present
       if(!optionalAuthor.isPresent()){
           //throw an error
           throw new Exception("the id you entered is wrong");
       }
       Author author= optionalAuthor.get(); // this get is used to get the entity
       return  author;
   }
}

package com.example.LibrarymanagementSystem.Entites;

import com.example.LibrarymanagementSystem.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table //if we not write any table name default it take name as table name
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
    private String bookname;
    private int price;
    private int noofpages;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;
    private double rating;

    // author need to write


    // we need to connect book to author
    @ManyToOne // here we need to write annotation regarding to present class.In book we have many books but one author
    @JoinColumn
    private Author author;// author entity


}

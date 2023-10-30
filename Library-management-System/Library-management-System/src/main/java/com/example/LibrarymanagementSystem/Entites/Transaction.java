package com.example.LibrarymanagementSystem.Entites;

import com.example.LibrarymanagementSystem.Enum.TransactionStatus;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer transactionId;
    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    private Date issueDate;

    private Date returnDate;

    private  Integer fine;

    private Date createdOn;
    private Date lastModifiedOn;
}

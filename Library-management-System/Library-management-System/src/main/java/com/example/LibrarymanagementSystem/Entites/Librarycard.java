package com.example.LibrarymanagementSystem.Entites;

import com.example.LibrarymanagementSystem.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "librarycard")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Librarycard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//it is used to generate card from 1 to so on
    private Integer cardNo;
    @Enumerated(value = EnumType.STRING) // we have different card status for sleceting one cardstatus we write all status in enum class
    private CardStatus cardstatus;
    private String nameOnCard;

  // we need to join libeary caed to student for that we need to write
    @OneToOne // relation or mapping b?w two tables
    @JoinColumn // for joining these tables we use this annotation
    private Student student; // we are telling  to which  table or entity we are joining // using unidirectinal mapping
}

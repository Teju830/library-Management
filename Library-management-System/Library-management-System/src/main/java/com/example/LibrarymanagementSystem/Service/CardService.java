package com.example.LibrarymanagementSystem.Service;

import com.example.LibrarymanagementSystem.Entites.Librarycard;
import com.example.LibrarymanagementSystem.Entites.Student;
import com.example.LibrarymanagementSystem.Enum.CardStatus;
import com.example.LibrarymanagementSystem.Repository.CardRepository;
import com.example.LibrarymanagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CardService {
@Autowired
 private CardRepository cardRepository;
@Autowired
private StudentRepository studentRepository;


public String associateStudentWithCardNo(Integer studentId, Integer CardNo){
    // before saving data into database we have to set the entity atrributies
    // we have 2 primary keys

    // get student details using find by id
    Optional<Student> studentOptional = studentRepository.findById(studentId);
    Student student = studentOptional.get();

    // get card ddetials

    Optional<Librarycard> librarycardOptional = cardRepository.findById(CardNo);
    Librarycard librarycard = librarycardOptional.get();
    // we need to set library card  entites

    librarycard.setCardstatus(CardStatus.ACTIVE);
    librarycard.setNameOnCard(student.getName());
    librarycard.setStudent(student);

    // set student entites
    student.setLibrarycard(librarycard);

    // we need to save two entites lb & s but its an bidirectinal mapping we need to save only one entity which is student
    studentRepository.save(student);
    return "Card with"+CardNo+"has been associated to Student with"+studentId;

}

    public String addplaincard() {
    Librarycard librarycard = new Librarycard();
    librarycard.setCardstatus(CardStatus.NEW);
    cardRepository.save(librarycard);
    return "Librarycard genetared succesfully";
    }
}

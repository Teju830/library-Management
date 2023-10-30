package com.example.LibrarymanagementSystem.Controller;

import com.example.LibrarymanagementSystem.Entites.Librarycard;
import com.example.LibrarymanagementSystem.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService cardService;

    @PostMapping("/generatePlainCard")
    public ResponseEntity<String> addplaincard(){
        String res=cardService.addplaincard();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @PutMapping("/associateWithStudent")
    public ResponseEntity associateWithStudent(@RequestParam("studentId") Integer studentId,@RequestParam("cardId")Integer cardNo){
 String result = cardService.associateStudentWithCardNo(studentId,cardNo);
 return new ResponseEntity(result,HttpStatus.OK);
    }
}

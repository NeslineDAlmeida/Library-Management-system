package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.model.Author;
import com.example.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
@Autowired
    BookService bookService;


    public String addBook(@RequestBody Author author){
      String response=BookService.addBook(author);
          return "Book added successfully!!";
    }
}

package com.example.exovalidation.controller;

import com.example.exovalidation.entity.Book;
import com.example.exovalidation.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService _bookService;
    @PostMapping("/save")
    ResponseEntity<String> createBook(@Valid @RequestBody Book book, @RequestBody Integer typeId, @RequestBody Integer authorId) {

        _bookService.save(book);
        return ResponseEntity.ok("Livre créé");
    }
}

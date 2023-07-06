package com.example.exovalidation.service;

import com.example.exovalidation.entity.Book;
import com.example.exovalidation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository _bookRepository;

    public void save(Book book) {
        _bookRepository.save(book);
    }
}

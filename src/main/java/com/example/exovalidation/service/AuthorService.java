package com.example.exovalidation.service;

import com.example.exovalidation.entity.Author;
import com.example.exovalidation.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository _authorRepository;
    public void save(Author author){
        _authorRepository.save(author);
    }
}

package com.example.exovalidation.service;

import com.example.exovalidation.entity.Book;
import com.example.exovalidation.entity.Type;
import com.example.exovalidation.repository.BookRepository;
import com.example.exovalidation.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
    @Autowired
    private TypeRepository _typeRepository;

    public void save(Type type) {
        _typeRepository.save(type);
    }
}

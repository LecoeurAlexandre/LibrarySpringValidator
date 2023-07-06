package com.example.exovalidation.controller;

import com.example.exovalidation.entity.Type;
import com.example.exovalidation.service.TypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("type")
public class TypeController {
    @Autowired
    TypeService _typeService;
    @PostMapping("/save")
    ResponseEntity<String> createType(@Valid @RequestBody Type type) {
        _typeService.save(type);
        return ResponseEntity.ok("Genre créé");
    }
}

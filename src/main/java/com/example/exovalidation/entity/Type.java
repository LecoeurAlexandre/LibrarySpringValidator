package com.example.exovalidation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(max= 10, message ="le nom du genre ne doit pas dépasser 10 caractères.")
    private String topic;
    @Size(max= 200, message ="le nom du genre ne doit pas dépasser 200 caractères.")
    private String description;
    @OneToMany(mappedBy = "type")
    private List<Book> books;
}

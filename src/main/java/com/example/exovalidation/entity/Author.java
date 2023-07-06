package com.example.exovalidation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(max=50, message = "Le nom de l'auteur ne doit pas comporter plus de {max} caractères.")
    private String name;
    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9]+@editor\\.com$", message = "L'adresse email doit se terminer par @editor.com.")
    private String email;
    @OneToMany(mappedBy = "author")
    private List<Book> books;
}

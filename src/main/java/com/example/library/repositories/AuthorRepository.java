package com.example.library.repositories;

import com.example.library.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
/*
    @Query(value = "select Book.name from Book ")
    List<String> getAuthorByBook(Author author);

 */
}

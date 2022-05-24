package com.example.library.conroller;

import com.example.library.domain.Author;
import com.example.library.domain.Book;
import com.example.library.repositories.AuthorRepository;
import com.example.library.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/library/author")
public class AuthorController {


    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping
    public List<Author> getCatalog() {
        return authorRepository.findAll();
    }

    @GetMapping("{id}")
    public Author getOne(@PathVariable("id") Author author) {
        return author;
    }

    /*private Map<String, String> getBook(String id) {
        return books.stream().filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);       /* выдаст 404 если полученный id не соответствует ни одному значению */

   /* @GetMapping("/author-books/{authorId}")
    public List<String> getAuthorByBooks(@PathVariable("id") Author author) {

    }*/

    @PostMapping
    public Author create(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("{id}")
    public Author update(@PathVariable("id") Author authorFromDB, @RequestBody Author author) {
        BeanUtils.copyProperties(author, authorFromDB);
        return authorRepository.save(authorFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Author author) {
        authorRepository.delete(author);
    }

}

package com.example.library.conroller;

import com.example.library.domain.Book;
import com.example.library.repositories.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/library/book")
public class BookController {


    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getCatalog() {
        return bookRepository.findAll();
    }

    @GetMapping("{id}")
    public Book getOne(@PathVariable("id") Book book) {
        return book;
    }

    /*private Map<String, String> getBook(String id) {
        return books.stream().filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);       /* выдаст 404 если полученный id не соответствует ни одному значению */

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("{id}")
    public Book update(@PathVariable("id") Book bookFromDB, @RequestBody Book book) {
        BeanUtils.copyProperties(book, bookFromDB);
        return bookRepository.save(bookFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Book book) {
        bookRepository.delete(book);
    }

}

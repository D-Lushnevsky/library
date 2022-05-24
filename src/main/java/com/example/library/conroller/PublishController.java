package com.example.library.conroller;

import com.example.library.domain.Author;
import com.example.library.domain.Book;
import com.example.library.domain.Publish;
import com.example.library.repositories.AuthorRepository;
import com.example.library.repositories.BookRepository;
import com.example.library.repositories.PublishRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/library/publish")
public class PublishController {


    private final PublishRepository publishRepository;

    @Autowired
    public PublishController(PublishRepository publishRepository) {
        this.publishRepository = publishRepository;
    }

    @GetMapping
    public List<Publish> getCatalog() {
        return publishRepository.findAll();
    }

    @GetMapping("{id}")
    public Publish getOne(@PathVariable("id") Publish publish) {
        return publish;
    }


   /* @GetMapping("/author-books/{authorId}")
    public List<String> getAuthorByBooks(@PathVariable("id") Author author) {

    }*/

    @PostMapping
    public Publish create(@RequestBody Publish publish) {
        return publishRepository.save(publish);
    }

    @PutMapping("{id}")
    public Publish update(@PathVariable("id") Publish publishFromDB, @RequestBody Publish publish) {
        BeanUtils.copyProperties(publish, publishFromDB);
        return publishRepository.save(publishFromDB);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Publish publish) {
        publishRepository.delete(publish);
    }

}

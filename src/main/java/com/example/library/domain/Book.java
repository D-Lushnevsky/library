package com.example.library.domain;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "number_of_pages")
    private Integer numberOfPages;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "publish_house_name")
    private String publishHouseName;



    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishHouseName() {
        return publishHouseName;
    }

    public void setPublishHouseName(String publishHouseName) {
        this.publishHouseName = publishHouseName;
    }
}


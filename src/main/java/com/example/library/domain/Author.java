package com.example.library.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;
/*
    @ManyToMany(mappedBy = "authorByBook", cascade = CascadeType.ALL)
    @JoinTable(name = "author_books", joinColumns = {@JoinColumn(name = "author_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")})
    private Set<Author> workResult = new HashSet<Author>();

    @ManyToMany(mappedBy = "authorByBook", cascade = CascadeType.ALL)
    @JoinTable(name = "author_books", joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")})
    private Set<Author> workers = new HashSet<Author>();
*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
/*
    public Set<Author> getWorkers() {
        return workers;
    }

    public void setWorkers(Set<Author> workers) {
        this.workers = workers;
    }
*/
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }
/*
    public Set<Author> getWorkResult() {
        return workResult;
    }

    public void setWorkResult(Set<Author> workResult) {
        this.workResult = workResult;
    }
*/
    public void setAge(Integer age) {
        this.age = age;
    }
}

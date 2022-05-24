package com.example.library.repositories;

import com.example.library.domain.Author;
import com.example.library.domain.Publish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishRepository extends JpaRepository<Publish, Long> {
}

package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.Book;

@Repository // Indicates that this interface is a Spring Data repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    // Extends JpaRepository to provide CRUD operations for Book entity
    // The first parameter is the type of the entity (Book)
    // The second parameter is the type of the entity's ID (Integer)
}

package com.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.entity.MyBookList;

@Repository // Indicates that this interface is a Spring Data repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {
    // Extends JpaRepository to provide CRUD operations for MyBookList entity
    // The first parameter is the type of the entity (MyBookList)
    // The second parameter is the type of the entity's ID (Integer)
}

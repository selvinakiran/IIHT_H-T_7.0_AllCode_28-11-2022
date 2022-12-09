package com.service.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.book.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

package com.globallogic.library.repositories;

import com.globallogic.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
   List<Book> findByBookTitleContainingAndRatingsAndPublishingYear(String bookTitle, double ratings, int publishingYear);
}

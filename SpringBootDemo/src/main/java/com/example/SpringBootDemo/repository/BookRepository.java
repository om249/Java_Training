
package com.example.SpringBootDemo.repository;

import com.example.SpringBootDemo.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book(1, "Java", "James", 500));
        books.add(new Book(2, "Spring Boot", "John", 1000));
        books.add(new Book(3, "Hibernate", "Martin", 450));
    }

    // Retrieve all books
    public List<Book> findAll() {
        return books;
    }

    // Retrieve a book by ID
    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}

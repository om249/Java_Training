package com.example.SpringBootDemo.repository;

import org.springframework.stereotype.Repository;
import java.util.*;
import java.awt.print.Book;

@Repository
public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    public BookRepository() {
        {
            books.add(new Book(1, "java", "james", 583));
        }
        books.add(new Book(2, "Python", "Jerry", 1000));
    }

//Retrive the data
public List<Book> findAll()
{
    return books;
}

//Retrive book by Id
public Book findById()
{
    for (Book book:books)
    {
        if(book.getId()==id)
        {
            return books;
        }
    }
    return null;
}
}
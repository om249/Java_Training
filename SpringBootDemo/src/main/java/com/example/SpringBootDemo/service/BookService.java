package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.entity.Book;
import com.example.SpringBootDemo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository =bookRepository;
    }

    public List<Book> getAllBook(){
        return bookRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRepository.findById(id);
    }
}






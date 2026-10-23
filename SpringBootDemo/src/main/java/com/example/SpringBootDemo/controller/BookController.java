package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.entity.Book;
import com.example.SpringBootDemo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService=bookService;
    }

    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable athvariable int id)
    {
        Book book=bookService.getBookById(id);

        if(book == null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(books);
    }
}

package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.entity.Book;
import com.example.SpringBootDemo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService= bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        Book book = bookService.getBookById(id);

        if(book == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }
}

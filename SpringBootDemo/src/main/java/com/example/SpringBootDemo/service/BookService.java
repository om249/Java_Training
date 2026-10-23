package com.example.SpringBootDemo.service;

import com.example.SpringBootDemo.repository.BookRepository;
import org.springframework.stereotype.Service;

@
@Service
public class BookService {

    private final BookRepository bookRepository;


        public BookService(BookRepository bookRepository){
            this.bookRepository=bookRepository;

        }

        public List<Book> getAllBook()
        {
            return bookRepository.finaAll();
        }

        public Book getBookById(int id)
        {
            return bookRepository.findById();
        }

}

package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // klasa jest kontrolerem Rest Api, obsługuje http request oraz generuje http response
@RequestMapping("/books") // wskazuje adres url usługi, tu: http://localhost:8080/books
class BookController {

    // w klasie są metody odp za obsługę konkretnych rodzajów http request

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping // ta metoda odp za obsługę http request wysyłanych za pomocą GET
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping // metoda odp za obsługę żądań http POST
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @DeleteMapping
    public void deleteBook(@RequestBody BookDto bookDto) {
        bookService.removeBook(bookDto);
    }
}

package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books = new ArrayList<>();

    public BookManager() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);

        for (Book b : books) {
            if (b.equals(book)) {
                return b;
            }
        }
        books.add(book);
        return book;
    }

    public List<Book> getBookList() {
        return books;
    }
}

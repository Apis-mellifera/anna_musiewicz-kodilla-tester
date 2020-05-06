package com.kodilla.soap.library.repository;

import com.kodilla.books.soap.Book;
import com.kodilla.books.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book hobbit = new Book();
        hobbit.setCallNo("123FS");
        hobbit.setTitle("The Hobbit");
        hobbit.setAuthor("J.R.R. Tolkien");
        hobbit.setPubYear(1937);
        hobbit.setGenre(Genre.FANTASY);

        books.put(hobbit.getCallNo(), hobbit);

        Book endlessNight = new Book();
        endlessNight.setCallNo("456CRI");
        endlessNight.setTitle("Endless Night");
        endlessNight.setAuthor("A. Cristie");
        endlessNight.setPubYear(1967);
        endlessNight.setGenre(Genre.CRIME);

        books.put(endlessNight.getCallNo(), endlessNight);

        Book ubik = new Book();
        ubik.setCallNo("789SF");
        ubik.setTitle("Ubik");
        ubik.setAuthor("P.K. Dick");
        ubik.setPubYear(1975);
        ubik.setGenre(Genre.SCI_FI);

        books.put(ubik.getCallNo(), ubik);

        Book howSmart = new Book();
        howSmart.setCallNo("908TE");
        howSmart.setTitle("How smart machines think");
        howSmart.setAuthor("S. Gerrish");
        howSmart.setPubYear(2019);
        howSmart.setGenre(Genre.TECH);

        books.put(howSmart.getCallNo(), howSmart);
    }

    public Book findBook(String callNo) {
        Assert.notNull(callNo, "You have to specify the books call number");
        return books.get(callNo);
    }
}

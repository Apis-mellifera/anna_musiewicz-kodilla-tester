package com.kodilla.collections.adv.immutable.special.homework;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookManagerTest {

    BookManager bookManager = new BookManager();
    Book book1 = new Book("title1", "author1");

    @Test
    public void shouldCreateNewBookWhenThereIsNoSuchOneYet() {
        //given
        bookManager.getBookList().add(book1);

        //when
        bookManager.createBook("title2", "author1");

        //then
        assertEquals(2, bookManager.getBookList().size());
    }

    @Test
    public void shouldNotCreateNewBookWhenThereIsSuchAlready() {
        //given
        bookManager.getBookList().add(book1);

        //when
        bookManager.createBook("title1", "author1");

        //then
        assertEquals(1, bookManager.getBookList().size());
    }
}
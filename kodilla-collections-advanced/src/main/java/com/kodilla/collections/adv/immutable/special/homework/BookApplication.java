package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = bookManager.createBook("Lord of the Rings", "J.R.R. Tolkien");
        Book book3 = bookManager.createBook("Alice in wonderland", "L. Carroll");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1 == book2);
        System.out.println(book1 ==  book3);
        System.out.println(book2 == book3);

    }
}

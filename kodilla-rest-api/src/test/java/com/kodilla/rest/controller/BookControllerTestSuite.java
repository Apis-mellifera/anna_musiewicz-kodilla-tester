package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

//@Mock
//BookService bookService;
//@InjectMocks
//BookController bookController;

public class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {
        //given
        BookService bookServiceMock = mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        Mockito.doNothing().when(bookServiceMock).addBook(Mockito.any(BookDto.class));
        ArgumentCaptor<BookDto> argument = ArgumentCaptor.forClass(BookDto.class);

        //when
        bookController.addBook(new BookDto("title1", "author1"));

        //then
        Mockito.verify(bookServiceMock).addBook(argument.capture());
        assertEquals("title1", argument.getValue().getTitle());
        assertEquals("author1", argument.getValue().getAuthor());
    }
}
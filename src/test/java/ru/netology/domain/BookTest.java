package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(4, "Throats", 50, "Garber");

    @Test
    void shouldNotMatchAuthorOfBook() {
        String text = "Gar";
        assertEquals(false, book.matches(text));
    }

    @Test
    void shouldMatchAuthorOfBook() {
        String text = "Garber";
        assertEquals(true, book.matches(text));

    }
}

package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product();

    @BeforeEach
    void SetUp() {
        product.setName("Alphabet");
    }


    @Test
    void shouldNotMatchNameOfProduct() {
        String text = "Azbuka";
        assertEquals(false, product.matches(text));
    }

    @Test
    void shouldMatchNameOfProduct() {
        String text = "Alphabet";
        assertEquals(true, product.matches(text));
    }

}

package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author=new Author("Willy","willy@gmail.com");
        assertEquals("Willy",author.getName());

    }

    @Test
    void getEmail() {
        Author author=new Author("Willy","willy@gmail.com");
        assertEquals("willy@gmail.com",author.getEmail());
    }

    @Test
    void setEmail() {
        Author author=new Author("Willy","willy@gmail.com");
        author.setEmail("juan@gmail.com");
        assertEquals("juan@gmail.com",author.getEmail());
    }

    @Test
    void testToString() {
        Author author=new Author("Willy","willy@gmail.com");
        assertEquals("Author[name=Willy,email=willy@gmail.com]",author.toString());
    }
}
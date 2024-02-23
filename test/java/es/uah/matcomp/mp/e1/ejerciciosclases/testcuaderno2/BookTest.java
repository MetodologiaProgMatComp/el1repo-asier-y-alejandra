package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Author;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals("1234567890", book.getIsbn());
    }

    @Test
    void getName() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals("Java2.0",book.getName());
    }

    @Test
    void getAuthor() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals(author,book.getAuthor());
    }

    @Test
    void getPrice() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals(29.99,book.getPrice());
    }

    @Test
    void setPrice() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        book.setPrice((32.95));
        assertEquals(32.95,book.getPrice());
    }

    @Test
    void getQty() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals(10,book.getQty());
    }

    @Test
    void setQty() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        book.setQty(5);
        assertEquals(5,book.getQty());
    }

    @Test
    void getAuthorName() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals("Pedro",book.getAuthorName());

    }

    @Test
    void testToString() {
        Author author = new Author("Pedro", "pedro@gmail.com");
        Book book = new Book("1234567890", "Java2.0", author, 29.99,10);
        assertEquals("Book[isbn=1234567890,name=Java2.0,Author[name=Pedro,email=pedro@gmail.com],price=29.99,qty=10]", book.toString());
    }
}
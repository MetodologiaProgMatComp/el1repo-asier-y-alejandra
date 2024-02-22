package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Book1Test {

    @Test
    void getName() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1[] author1s={author1};
        Book1 book1= new Book1("Java",author1s,15.56);
        assertEquals("Java",book1.getName());

    }

    @Test
    void getAuthor1s() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1 author2 = new Author1("Lucas Perez","lucas@gmail.com",'m');
        Author1[] author1s= {author1,author2};
        Book1 book1=new Book1("Java",author1s,15.56,10);
        assertArrayEquals(author1s, book1.getAuthor1s());

    }

    @Test
    void getPrice() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1[] author1s={author1};
        Book1 book1= new Book1("Java",author1s,15.56,10);
        assertEquals(15.56,book1.getPrice());
    }

    @Test
    void getQty() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1[] author1s={author1};
        Book1 book1= new Book1("Java",author1s,15.56,10);
        assertEquals(10,book1.getQty());
    }

    @Test
    void setPrice() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1[] author1s={author1};
        Book1 book1= new Book1("Java",author1s,15.56,10);
        book1.setPrice(19.95);
        assertEquals(19.95,book1.getPrice());
    }

    @Test
    void setQty() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1[] author1s={author1};
        Book1 book1= new Book1("Java",author1s,15.56,10);
        book1.setQty(11);
        assertEquals(11,book1.getQty());
    }

    @Test
    void testToString() {
        Author1 author1 = new Author1("Juanito Perez","juanito@gmail.com",'m');
        Author1 author2=new Author1("Lucas Perez", "lucas@gmail.com",'m');
        Author1[] author1s={author1,author2};
        Book1 book1= new Book1("Java",author1s,15.56,10);
        assertEquals("Book[name=Java,authors={Juanito Perez,Lucas Perez,},price=15.56,qty=10]",book1.toString());
    }

    @Test
    void getPrimeroAuthor1Name() {
    }

    @Test
    void getPrimerAuthor1Email() {
    }

    @Test
    void getPrimerAuthorGender() {
    }
}
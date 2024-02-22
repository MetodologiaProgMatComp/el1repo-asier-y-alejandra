package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Author1Test {

    @Test
    void getName() {
        Author1 author1 = new Author1("Jack Sparrow", "jacksparrow@pirata.com",'m');
        assertEquals("Jack Sparrow",author1.getName());

    }

    @Test
    void getEmail() {
        Author1 author1 = new Author1("Jack Sparrow", "jacksparrow@pirata.com",'m');
        assertEquals("jacksparrow@pirata.com",author1.getEmail());
    }

    @Test
    void setEmail() {
        Author1 author1 = new Author1("Jack Sparrow", "jacksparrow@pirata.com",'m');
        author1.setEmail("juansparrow@pirata.com");
        assertEquals("juansparrow@pirata.com",author1.getEmail());

    }

    @Test
    void getGender() {
        Author1 author1 = new Author1("Jack Sparrow", "jacksparrow@pirata.com",'m');
        assertEquals('m',author1.getGender());
    }

    @Test
    void testToString() {
        Author1 author1 = new Author1("Jack Sparrow", "jacksparrow@pirata.com",'m');
        assertEquals("Author [name=Jack Sparrow, email=jacksparrow@pirata.com, gender=m]", author1.toString());
    }
}
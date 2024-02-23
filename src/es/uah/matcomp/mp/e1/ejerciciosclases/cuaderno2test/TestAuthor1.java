package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2test;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Author1;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Book1;

public class TestAuthor1 {
    //TEST
    public static void main(String[] args) {
        Author1 ahTeck = new Author1("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName()); // Test getter
        System.out.println("email is: " + ahTeck.getEmail()); // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test
        // Declare and allocate an array of Authors
        Author1[] authors = new Author1[2];
        authors[0] = new Author1("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author1("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()

    }
}

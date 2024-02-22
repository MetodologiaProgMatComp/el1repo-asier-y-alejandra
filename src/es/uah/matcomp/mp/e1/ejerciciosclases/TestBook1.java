package es.uah.matcomp.mp.e1.ejerciciosclases;

public class TestBook1 {
    public static void main(String[]args) {
        /*
        // Construct an author instance
        Author1 ahTeck = new Author1("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Author's toString()

        Book1 dummyBook1 = new Book1("Java for dummy", ahTeck, 19.95, 99); // Test Book's Constructor
        System.out.println(dummyBook1); // Test Book's toString()

        // Test Getters and Setters
        dummyBook1.setPrice(29.95);
        dummyBook1.setQty(28);
        System.out.println("name is: " + dummyBook1.getName());
        System.out.println("price is: " + dummyBook1.getPrice());
        System.out.println("qty is: " + dummyBook1.getQty());

        System.out.println("Author is: " + dummyBook1.getAuthor()); // Author's toString()

        System.out.println("Author's name is: " + dummyBook1.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook1.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book1 anotherBook = new Book1("more Java",
                new Author1("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()
        System.out.println("Author's name is: " + dummyBook1.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook1.getAuthor().getEmail());

        //APARTADO 1 MODIFICACIONES
        Book1 book2 = new Book1("more Java",  //Creamos un nuevo libro llamado book2
                new Author1("Manolo Gomez", "manolo@somewhere.com", 'm'), 35.52);
        System.out.println(anotherBook); // toString()
        System.out.println("Author's name is: " + book2.getAuthor().getName()); //Accedemos a la información de book2 a través del comando book2.get...
        System.out.println("Author's email is: " + book2.getAuthor().getEmail()); */

        //ULTIMO EJERCICIO (2.2)

        // Declare and allocate an array of Authors
        Author1[] authors = new Author1[2];
        authors[0] = new Author1("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author1("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()



    }
}

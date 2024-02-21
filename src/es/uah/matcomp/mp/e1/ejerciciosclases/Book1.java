package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Book1 {
    private String name;
    private Author1 author;
    private double price;
    private int qty = 0;
    public Book1 (String name, Author1 author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book1(String name, Author1 author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author1 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {
        return "Book[name=" + name + ",author=" + author +",price=" + price + ",qty=" + qty + "]";
    }

    //TEST
    public static void main(String[]args) {
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
    }

    //MODIFICACIONES


    //APARTADO 2

    //Nuevo método para obtener el nombre del autor
    public String getAuthor1Name() {
        return author.getName(); // cannot use author.name as name is private in Author class
    }

    //Nuevo método para obtener el email del autor
    public String getAuthor1Email() {
        return author.getEmail();
    }

    //Nuevo método para obtener el género del autor
    public char getAuthorGender() {
        return author.getGender();
    }
}

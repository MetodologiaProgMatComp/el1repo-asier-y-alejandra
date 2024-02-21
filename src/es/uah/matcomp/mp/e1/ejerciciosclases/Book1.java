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


    //MODIFICACIONES
    ///APARTADO 2
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

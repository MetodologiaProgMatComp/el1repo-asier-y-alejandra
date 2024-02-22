package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Book1 {
    private String name;
    private Author1[] author1s;
    private double price;
    private int qty = 0;
    public Book1 (String name, Author1[] author1s, double price) {
        this.name = name;
        this.author1s = author1s;
        this.price = price;
    }
    public Book1(String name, Author1[] author1s, double price, int qty) {
        this.name = name;
        this.author1s = author1s;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author1[] getAuthor1s() {
        return author1s;
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
        String authorNames = "";
        for (Author1 author : author1s){
            authorNames += author.getName() + ", ";
        }
        return "Book[name=" + name + ",authors={" + authorNames +"},price=" + price + ",qty=" + qty + "]";
    }


    //MODIFICACIONES
    ///APARTADO 2
    //Nuevo método para obtener el nombre del autor (LA MODIFICACION FINAL ES PONER UN METODO PARA QUE NOS DE EL NOMBRE DEL PRIMER AUTOR YA QUE HAY MAS DE 1)
    public String getPrimeroAuthor1Name() {
        return author1s[0].getName(); // cannot use author.name as name is private in Author class
    }

    //Nuevo método para obtener el email del autor (LA MODIFICACION FINAL ES PONER UN METODO PARA QUE NOS DE EL EMAIL DEL PRIMER AUTOR YA QUE HAY MAS DE 1)
    public String getPrimerAuthor1Email() {
        return author1s[0].getEmail();
    }

    //Nuevo método para obtener el género del autor (LA MODIFICACION FINAL ES PONER UN METODO PARA QUE NOS DE EL GENERO DEL PRIMER AUTOR YA QUE HAY MAS DE 1)
    public char getPrimerAuthorGender() {
        return author1s[0].getGender();
    }
}

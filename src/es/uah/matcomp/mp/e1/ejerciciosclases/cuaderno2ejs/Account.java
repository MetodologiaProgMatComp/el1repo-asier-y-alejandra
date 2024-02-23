package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs;

public class Account {
    private int id;
    private Customer2 customer;
    private double balance = 0.0;

    public Account(int id, Customer2 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer2 customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public Customer2 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return
    }
}


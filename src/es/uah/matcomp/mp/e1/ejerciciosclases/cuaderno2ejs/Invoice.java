package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs;

public class Invoice {
    private int id;
    private Customer1 customer;
    private double amount;

    public Invoice(int id, Customer1 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer1 getCustomer() {
        return customer;
    }
    public void setCustomer (Customer1 customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - (amount*this.customer.getDiscount() /100.0); //viajo a la otra clase para acceder al descuento
    }
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}

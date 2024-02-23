package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Customer;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Invoice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Invoice invoice = new Invoice(1,new Customer(1, "Pepito Pérez", 10), 1000.0);
        assertEquals(1, invoice.getId());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer(1, "Pepito Pérez", 10);
        Invoice invoice = new Invoice(1, customer, 1000.0);
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez", 10), 1000.0);
        Customer newCustomer = new Customer(2, "Luisa García", 25);
        invoice.setCustomer(newCustomer);
        assertEquals(newCustomer, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        Invoice invoice = new Invoice(1, new Customer(1,"Pepito Pérez", 10), 1000.0);
        assertEquals(1000.0, invoice.getAmount());
    }

    @Test
    void setAmount() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez", 10), 1000.0);
        invoice.setAmount(250.0);
        assertEquals(250.0, invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez", 10), 1000.0);
        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez", 10), 1000.0);
        assertEquals("Pepito Pérez", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez", 10), 1000.0);
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez",10),1000.0);
        assertEquals(900.0, invoice.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Invoice invoice = new Invoice(1, new Customer(1, "Pepito Pérez", 10), 1000.0);
        assertEquals("Invoice[id=1,customer=Pepito Pérez (1) (10%),amount=1000.0]", invoice.toString());
    }
}
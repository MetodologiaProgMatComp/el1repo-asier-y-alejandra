package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(1, "Pepito Pérez", 10);
        assertEquals(1,customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(1,"Pepito Pérez", 10);
        assertEquals("Pepito Pérez", customer.getName());
    }

    @Test
    void getDiscount() {
        Customer customer = new Customer(1, "Pepito Pérez", 10);
        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer customer = new Customer(1, "Pepito Pérez", 10);
        customer.setDiscount(20);
        assertEquals(20, customer.getDiscount());
    }

    @Test
    void testToString() {
        Customer customer = new Customer(1, "Pepito Pérez", 10);
        assertEquals("Pepito Pérez (1) (10%)", customer.toString());
    }
}
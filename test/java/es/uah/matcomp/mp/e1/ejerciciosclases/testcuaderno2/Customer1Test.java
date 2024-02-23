package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Customer1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer1Test {

    @Test
    void getId() {
        Customer1 customer = new Customer1(1, "Pepito Pérez", 10);
        assertEquals(1,customer.getId());
    }

    @Test
    void getName() {
        Customer1 customer = new Customer1(1,"Pepito Pérez", 10);
        assertEquals("Pepito Pérez", customer.getName());
    }

    @Test
    void getDiscount() {
        Customer1 customer = new Customer1(1, "Pepito Pérez", 10);
        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer1 customer = new Customer1(1, "Pepito Pérez", 10);
        customer.setDiscount(20);
        assertEquals(20, customer.getDiscount());
    }

    @Test
    void testToString() {
        Customer1 customer = new Customer1(1, "Pepito Pérez", 10);
        assertEquals("Pepito Pérez (1) (10%)", customer.toString());
    }
}
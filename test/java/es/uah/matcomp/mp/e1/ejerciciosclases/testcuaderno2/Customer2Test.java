package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.Customer2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer2Test {

    @Test
    void getId() {
        Customer2 customer = new Customer2(1, "Pepito Pérez", 'M');
        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        Customer2 customer = new Customer2(1, "Pepito Pérez", 'M');
        assertEquals("Pepito Pérez", customer.getName()); //Importante poner todo lo de name
    }

    @Test
    void getGender() {
        Customer2 customer = new Customer2(1, "Pepito Pérez", 'M');
        assertEquals('M', customer.getGender());
    }

    @Test
    void testToString() {
        Customer2 customer = new Customer2(1, "Pepito Pérez", 'M');
        assertEquals("Pepito Pérez(1)", customer.toString());
    }
}
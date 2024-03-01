package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {

    }

    @Test
    void testGreets() {
    }

    @Test
    void testToString() {
        Dog dog=new Dog("Loki");
        assertEquals("Dog[Mammal[Animal[name=Loki]]]",dog.toString());
    }
}
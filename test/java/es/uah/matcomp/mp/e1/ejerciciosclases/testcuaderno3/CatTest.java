package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
    }

    @Test
    void testToString() {
        Cat cat=new Cat("Misi");
        assertEquals("Cat[Mammal[Animal[name=Misi]]]",cat.toString());
    }
}
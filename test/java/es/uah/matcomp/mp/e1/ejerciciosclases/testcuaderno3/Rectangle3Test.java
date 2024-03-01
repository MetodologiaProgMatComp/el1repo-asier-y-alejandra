package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Rectangle3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle3Test {

    @Test
    void testToString() {
        Rectangle3 rectangle = new Rectangle3(2.0,3.0);
        assertEquals("Rectangle[width=2.0,length=3.0]", rectangle.toString());
    }

    @Test
    void getArea() {
        Rectangle3 rectangle = new Rectangle3(2.0,3.0);
        assertEquals(2.0 * 3.0, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle3 rectangle = new Rectangle3(2.0,3.0);
        assertEquals(2.0*2 + 3.0*2, rectangle.getPerimeter());
    }
}
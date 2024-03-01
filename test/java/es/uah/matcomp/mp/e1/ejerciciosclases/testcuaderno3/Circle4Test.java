package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Circle4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle4Test {

    @Test
    void testToString() {
        Circle4 circle = new Circle4(2.0);
        assertEquals("Circle[radius=2.0]", circle.toString());
    }

    @Test
    void getArea() {
        Circle4 circle = new Circle4(2.0);
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea());
    }


    @Test
    void getPerimeter() {
        Circle4 circle = new Circle4(2.0);
        assertEquals(2 * Math.PI * 2.0 , circle.getArea());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(3.0);
        assertEquals(3.0,circle.getRadius());
    }

    @Test
    void setRadius() {
        Circle circle = new Circle(4.0);
        assertEquals(4.0,circle.getRadius());
    }

    @Test
    void getColor() {
        Circle circle = new Circle(3.5, "black");
        assertEquals("black", circle.getColor());
    }

    @Test
    void setColor() {
        Circle circle = new Circle(5.0);
        circle.setColor("white");
        assertEquals("white", circle.getColor());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(7.0);
        assertEquals(Math.PI * 7.0 * 7.0, circle.getArea());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.5, "blue");
        assertEquals("Circle[radius=2.5,color=blue]", circle.toString());
    }
}
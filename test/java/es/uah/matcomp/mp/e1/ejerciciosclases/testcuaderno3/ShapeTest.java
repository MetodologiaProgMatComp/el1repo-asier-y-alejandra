package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape=new Shape("blue",true);
        assertEquals("blue",shape.getColor());
    }

    @Test
    void setColor() {
        Shape shape=new Shape("blue",true);
        shape.setColor("red");
        assertEquals("red",shape.getColor());
    }

    @Test
    void isFilled() {
        Shape shape=new Shape("blue",true);
        assertTrue(shape.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape=new Shape("blue",true);
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        Shape shape=new Shape("blue",true);
        assertEquals("Shape[color=blue,filled=true]",shape.toString());
    }
}
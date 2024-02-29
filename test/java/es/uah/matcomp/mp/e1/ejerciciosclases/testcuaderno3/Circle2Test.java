package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Circle2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void getRadius() {
        Circle2 circle2=new Circle2(5.0);
        assertEquals(5.0,circle2.getRadius());
    }

    @Test
    void setRadius() {
        Circle2 circle2=new Circle2(5.0);
        circle2.setRadius(8.0);
        assertEquals(8.0,circle2.getRadius());
    }

    @Test
    void getArea() {
        Circle2 circle2=new Circle2(5.0);
        assertEquals(78.53981633974483,circle2.getArea());
    }

    @Test
    void getPerimeter() {
        Circle2 circle2=new Circle2(5.0);
        assertEquals(31.41592653589793,circle2.getPerimeter());
    }

    @Test
    void testToString() {
        Circle2 circle2=new Circle2(5.0,"red",true);
        assertEquals("Circle[Shape[color=red,filled=true],radius=5.0]",circle2.toString());
    }
}
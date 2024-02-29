package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidht() {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        assertEquals(2.0,rectangle.getWidht());
    }

    @Test
    void setWidht() {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        rectangle.setWidht(4.0);
        assertEquals(4.0,rectangle.getWidht());
    }

    @Test
    void getLength() {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        assertEquals(3.0,rectangle.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        rectangle.setLength(6.0);
        assertEquals(6.0,rectangle.getLength());
    }

    @Test
    void getArea() {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        assertEquals(6.0,rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle=new Rectangle(2.0,3.0);
        assertEquals(10.0,rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectangle=new Rectangle(2.0,3.0,"red",true);
        assertEquals("Rectangle[Shape[color=red,filled=true],width=2.0,length=3.0]",rectangle.toString());
    }
}
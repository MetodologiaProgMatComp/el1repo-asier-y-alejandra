package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point point = new Point(2.0f, 5.0f);
        assertEquals(2.0f, point.getX());
    }

    @Test
    void setX() {
        Point point = new Point(2.0f, 5.0f);
        point.setX(6.0f);
        assertEquals(6.0f, point.getX());
    }

    @Test
    void getY() {
        Point point = new Point(2.0f, 5.0f);
        assertEquals(5.0f, point.getY());
    }

    @Test
    void setY() {
        Point point = new Point(2.0f, 5.0f);
        point.setY(9.0f);
        assertEquals(9.0f, point.getY());
    }

    @Test
    void setXY() {
        Point point = new Point(2.0f, 5.0f);
        point.setXY(6, 8);
        assertEquals(6.0f, point.getX());
        assertEquals(8.0f, point.getY());
    }

    @Test
    void getXY() {
        Point point = new Point(2.0f, 5.0f);
        assertEquals(2.0f, point.getX());
        assertEquals(5.0f, point.getY());
    }

    @Test
    void testToString() {
        Point point = new Point(2.0f, 5.0f);
        assertEquals("(2.0,5.0)", point.toString());
    }
}
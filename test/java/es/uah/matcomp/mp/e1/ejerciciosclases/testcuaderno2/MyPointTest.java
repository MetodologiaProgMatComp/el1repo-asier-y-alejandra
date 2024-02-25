package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint point = new MyPoint(4, 6);
        assertEquals(4, point.getX());
    }

    @Test
    void setX() {
        MyPoint point = new MyPoint();
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void getY() {
        MyPoint point = new MyPoint(4, 6);
        assertEquals(6, point.getY());
    }

    @Test
    void setY() {
        MyPoint point = new MyPoint();
        point.setY(8);
        assertEquals(8, point.getY());
    }

    @Test
    void getXY() {
        MyPoint point = new MyPoint(4, 6);
        assertArrayEquals(new int[]{4, 6}, point.getXY()); //estoy comparando el contenido del array, uso assertArrayEquals()
    }

    @Test
    void setXY() {
        MyPoint point = new MyPoint();
        point.setXY(2, 4);
        assertArrayEquals(new int[]{2, 4}, point.getXY());
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(4, 6);
        assertEquals("(4,6)", point.toString());
    }

    @Test
    void distance() {
        MyPoint point = new MyPoint(4, 6);
        assertEquals(0.0, point.distance(4, 6));
    }

    @Test
    void testDistance() {
        MyPoint point1 = new MyPoint(5, 4);
        MyPoint point2 = new MyPoint(5, 8);
        assertEquals(4.0, point1.distance(point2));
    }

    @Test
    void testDistance1() {
        MyPoint point = new MyPoint(5, 4);
        double expectedDistance = Math.sqrt(5 * 5 + 4 * 4); //uso double para declarar el tipo de variable
        assertEquals(expectedDistance, point.distance()); //lo hago asi porque poniendo directamente el resultado hay error con los decimales
    }
}
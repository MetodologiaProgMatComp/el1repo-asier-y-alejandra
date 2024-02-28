package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D point = new Point2D(3.0f, 8.0f); //uso la f para asignar un float, ya que si no sería double
        assertEquals(3.0f, point.getX());
    }

    @Test
    void setX() {
        Point2D point = new Point2D(3.0f, 8.0f);
        point.setX(4.0f);
        assertEquals(4.0f, point.getX());
    }

    @Test
    void getY() {
        Point2D point = new Point2D(3.0f, 8.0f);
        assertEquals(8.0f, point.getY());
    }

    @Test
    void setY() {
        Point2D point = new Point2D(3.0f, 8.0f);
        point.setY(2.0f);
        assertEquals(2.0f, point.getY());
    }

    @Test
    void setXY() {
        Point2D point = new Point2D(3.0f, 8.0f);
        point.setXY(4.0f, 5.0f);
        assertArrayEquals(new float[]{4.0f, 5.0f}, point.getXY());
    }

    @Test
    void getXY() {
        Point2D point = new Point2D(3.0f, 8.0f);
        assertArrayEquals(new float[]{3.0f, 8.0f}, point.getXY());
    }

    @Test
    void testToString() {
        Point2D point = new Point2D(3.0f, 8.0f);
        assertEquals("(3.0,8.0)", point.toString());
    }
}
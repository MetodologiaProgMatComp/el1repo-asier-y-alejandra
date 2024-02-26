package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.MyCircle;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle circle = new MyCircle(1,2,3);
        assertEquals(3,circle.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle(1,2,3);
        circle.setRadius(4);
        assertEquals(4,circle.getRadius());
    }

    @Test
    void getCenter() {
        MyCircle circle = new MyCircle(1,2,3);
        MyPoint center = circle.getCenter();
        assertEquals(1,center.getX());
        assertEquals(2, center.getY());
    }

    @Test
    void setCenter() {
        MyCircle circle = new MyCircle(1,2,3);
        MyPoint newCenter = new MyPoint(2,5);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void getCenterX() {
        MyCircle circle = new MyCircle(1,2,3);
        assertEquals(1,circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle circle = new MyCircle(1,2,3);
        circle.setCenterX(7);
        assertEquals(7,circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle circle = new MyCircle(1,2,3);
        assertEquals(2,circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle circle = new MyCircle(1,2,3);
        circle.setCenterY(10);
        assertEquals(10,circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle circle = new MyCircle(1,2,3);
        assertArrayEquals(new int[]{1,2}, circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle circle = new MyCircle(1,2,3);
        circle.setCenterXY(4,8);
        assertArrayEquals(new int[]{4,8}, circle.getCenterXY());
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(1,2,3);
        assertEquals("MyCircle[radius=3,center=(1,2)]", circle.toString());
    }

    @Test
    void getArea() {
        MyCircle circle = new MyCircle(1,2,3);
        assertEquals(Math.PI*9, circle.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle circle = new MyCircle(1,2,3);
        assertEquals(2*Math.PI*3, circle.getCircumference());
    }

    @Test
    void distance() {
        MyCircle circle1 = new MyCircle(8,2,3);
        MyCircle circle2 = new MyCircle(4,2,3);
        assertEquals(Math.sqrt(4*4), circle1.distance(circle2));
    }
}
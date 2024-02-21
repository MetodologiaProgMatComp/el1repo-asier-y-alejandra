package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        assertEquals(4.0, ball.getX());
    }

    @Test
    void setX() {
        Ball ball = new Ball (4.0, 6.0, 2, -1.0, 3.0);
        ball.setX(6.0);
        assertEquals(6.0, ball.getX());
    }

    @Test
    void getY() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        assertEquals(6.0, ball.getY());
    }

    @Test
    void setY() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.setY(8.0);
        assertEquals(8.0, ball.getY());
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        assertEquals(2, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.setRadius(4);
        assertEquals(4, ball.getRadius());
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        assertEquals(-1.0, ball.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.setXDelta(-3.0);
        assertEquals(-3.0, ball.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        assertEquals(3.0, ball.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.setYDelta(3.2);
        assertEquals(3.2, ball.getYDelta());
    }

    @Test
    void move() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.move();
        assertEquals(3.0, ball.getX());
        assertEquals(9.0, ball.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.reflectHorizontal();
        assertEquals(1.0, ball.getXDelta());
        assertEquals(3.0, ball.getYDelta());
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        ball.reflectVertical();
        assertEquals(-1.0, ball.getXDelta());
        assertEquals(-3.0, ball.getYDelta());
    }

    @Test
    void testToString() {
        Ball ball = new Ball(4.0, 6.0, 2, -1.0, 3.0);
        assertEquals("Ball[(4.0,6.0), speed=(-1.0, 3.0)]", ball.toString());
    }
}
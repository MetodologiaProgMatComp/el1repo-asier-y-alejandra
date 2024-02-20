package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        assertEquals(4.0f, ball.getX());
    }

    @Test
    void setX() {
        Ball ball = new Ball (4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.setX(6.0f);
        assertEquals(6.0f, ball.getX());
    }

    @Test
    void getY() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        assertEquals(6.0f, ball.getY());
    }

    @Test
    void setY() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.setY(8.0f);
        assertEquals(8.0f, ball.getY());
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        assertEquals(2, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.setRadius(4);
        assertEquals(4, ball.getRadius());
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        assertEquals(-1.0f, ball.getXDelta());
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.setXDelta(-3.0f);
        assertEquals(-3.0f, ball.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        assertEquals(3.0f, ball.getYDelta());
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.setYDelta(3.2f);
        assertEquals(3.2f, ball.getYDelta());
    }

    @Test
    void move() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.move();
        assertEquals(4.0f, ball.getX());
        assertEquals(5.5f, ball.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.reflectHorizontal();
        assertEquals(-1.0, ball.getXDelta());
        assertEquals(3.0, ball.getYDelta());
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        ball.reflectVertical();
        assertEquals(-1.0f, ball.getXDelta());
        assertEquals(3.0, ball.getYDelta());
    }

    @Test
    void testToString() {
        Ball ball = new Ball(4.0f, 6.0f, 2, -1.0f, 3.0f);
        assertEquals("Ball[(4.0,6.0), speed=(-1.0, 3.0)]", ball.toString());
    }
}
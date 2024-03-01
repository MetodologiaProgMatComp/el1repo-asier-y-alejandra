package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.MovableCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        assertEquals("(1,2) speed=(3,4), radius=5", circle.toString());
    }

    @Test
    void moveUp() {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        circle.moveUp();
        assertEquals("(1,-2) speed=(3,4), radius=5", circle.toString());
    }

    @Test
    void moveDown() {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        circle.moveDown();
        assertEquals("(1,6) speed=(3,4), radius=5", circle.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        circle.moveLeft();
        assertEquals("(-2,2) speed=(3,4), radius=5", circle.toString());
    }

    @Test
    void moveRight() {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        circle.moveRight();
        assertEquals("(4,2) speed=(3,4), radius=5", circle.toString());
    }
}
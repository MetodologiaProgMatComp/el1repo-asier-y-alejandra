package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Movable;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.MovablePoint2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePoint2Test {

    @Test
    void testToString() {
        Movable movablePoint = new MovablePoint2(1,2,3,4);
        assertEquals("(1,2) speed=(3,4)", movablePoint.toString());
    }

    @Test
    void moveUp() {
        Movable movablePoint = new MovablePoint2(1,2,3,4);
        movablePoint.moveUp();
        assertEquals("(1,-2) speed=(3,4)", movablePoint.toString());
    }

    @Test
    void moveDown() {
        Movable movablePoint = new MovablePoint2(1,2,3,4);
        movablePoint.moveDown();
        assertEquals("(1,6) speed=(3,4)", movablePoint.toString());
    }

    @Test
    void moveLeft() {
        Movable movablePoint = new MovablePoint2(1,2,3,4);
        movablePoint.moveLeft();
        assertEquals("(-2,2) speed=(3,4)", movablePoint.toString());
    }

    @Test
    void moveRight() {
        Movable movablePoint = new MovablePoint2(1,2,3,4);
        movablePoint.moveRight();
        assertEquals("(4,2) speed=(3,4)", movablePoint.toString());
    }
}
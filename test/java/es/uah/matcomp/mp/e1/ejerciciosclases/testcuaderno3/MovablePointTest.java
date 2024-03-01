package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.MovablePoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getXSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertEquals(3.0f, movablePoint.getXSpeed());
    }

    @Test
    void setXSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        movablePoint.setXSpeed(7.0f);
        assertEquals(7.0f, movablePoint.getXSpeed());
    }

    @Test
    void getYSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertEquals(4.0f, movablePoint.getYSpeed());
    }

    @Test
    void setYSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        movablePoint.setYSpeed(9.0f);
        assertEquals(9.0f, movablePoint.getYSpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        movablePoint.setSpeed(12.0f, 13.0f);
        assertEquals(12.0f, movablePoint.getXSpeed());
        assertEquals(13.0f, movablePoint.getYSpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertArrayEquals(new float[]{3.0f, 4.0f}, movablePoint.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        assertEquals("(1.0,2.0), speed=(3.0,4.0)", movablePoint.toString());
    }

    @Test
    void move() {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        MovablePoint movedPoint = movablePoint.move(); //lo hago así porque si no llamaría dos veces al método 'move()'y modifica el objeto 'movablePoint' que tiene de la llamada anterior
        assertEquals(4.0f, movedPoint.getX());
        assertEquals(6.0f, movedPoint.getY()); //saldría 10 (4+6) si hubiese llamado aquí de nuevo al método 'move'
    }
}
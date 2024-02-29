package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Line;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.LineSub;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Point; //agrego esta linea para que la ubicacion de los paquetes y directorios sea correcta
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void testToString() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals("Linea desde (1.0,2.0) hasta (3.0,4.0)", line.toString());
    }

    @Test
    void getBegin() {
        LineSub line = new LineSub(1, 2, 3, 4);
        Point begin = line.getBegin();
        assertEquals(1, begin.getX());
        assertEquals(2, begin.getY());
    }

    @Test
    void getEnd() {
        LineSub line = new LineSub(1, 2, 3, 4);
        Point end = line.getEnd();
        assertEquals(3, end.getX());
        assertEquals(4, end.getY());
    }

    @Test
    void setBegin() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setBegin(7, 8);
        assertEquals(7, line.getBeginX());
        assertEquals(8, line.getBeginY());
    }

    @Test
    void setEnd() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEnd(7, 8);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void getBeginX() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(2, line.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(4, line.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setBeginX(7);
        assertEquals(7, line.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setBeginY(7);
        assertEquals(7, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setBeginXY(7, 8);
        assertEquals(7, line.getBeginX());
        assertEquals(8, line.getBeginY());
    }

    @Test
    void setEndX() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void setEndY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub line = new LineSub(1, 2, 3, 4);
        line.setEndXY(7, 8);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void getLength() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(Math.sqrt((3 - 1) * (3 - 1) + (4 - 2) * (4 - 2)), line.getLength());
    }

    @Test
    void getGradient() {
        LineSub line = new LineSub(1, 2, 3, 4);
        assertEquals(Math.atan2(4 - 2, 3 - 1), line.getGradient());
    }
}
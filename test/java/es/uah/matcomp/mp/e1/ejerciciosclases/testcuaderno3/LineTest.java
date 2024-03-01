package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Line;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testToString() {
        Point begin = new Point(4, 1);
        Point end = new Point(2, 3);
        Line line = new Line(begin, end);
        assertEquals("Linea desde (4.0,1.0) hasta (2.0,3.0)", line.toString());
    }

    @Test
    void getBegin() {
        Point begin = new Point(4, 1);
        Point end = new Point(2, 3);
        Line line = new Line(begin, end);
        assertEquals(begin, line.getBegin());
    }

    @Test
    void getEnd() {
        Point begin = new Point(4, 1);
        Point end = new Point(2, 3);
        Line line = new Line(begin, end);
        assertEquals(end, line.getEnd());
    }

    @Test
    void setBegin() {
        Point begin = new Point(4, 1);
        Point newBegin = new Point(2, 3);
        Line line = new Line(begin, new Point(4, 8));
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void setEnd() {
        Point end = new Point(4, 1);
        Point newEnd = new Point(8, 2);
        Line line = new Line(new Point(4, 1), end);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void getBeginX() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());
    }

    @Test
    void getBeginY() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(2, line.getBeginY());
    }

    @Test
    void getEndX() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(3, line.getEndX());
    }

    @Test
    void getEndY() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(4, line.getEndY());
    }

    @Test
    void setBeginX() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginX(7);
        assertEquals(7, line.getBeginX());
    }

    @Test
    void setBeginY() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginY(7);
        assertEquals(7, line.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginXY(7, 3);
        assertEquals(7, line.getBeginX());
        assertEquals(3, line.getBeginY());
    }

    @Test
    void setEndX() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndX(7);
        assertEquals(7, line.getEndX());
    }

    @Test
    void setEndY() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void setEndXY() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndXY(4, 6);
        assertEquals(4, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void getLength() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(Math.sqrt((3 - 1) * (3 - 1) + (4 - 2) * (4 - 2)), line.getLength());
    }

    @Test
    void getGradient() {
        Line line = new Line(1, 0, 2, 2);
        assertEquals(Math.atan2(2 - 0, 2 - 1), line.getGradient());
    }
}
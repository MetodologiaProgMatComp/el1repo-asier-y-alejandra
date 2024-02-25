package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint begin = new MyPoint(2,3);
        MyPoint end = new MyPoint(4,5);
        MyLine line = new MyLine(begin,end);
        assertEquals(begin, line.getBegin());
    }

    @Test
    void setBegin() {
        MyPoint begin = new MyPoint(2,3);
        MyPoint newBegin = new MyPoint(4,8);
        MyLine line = new MyLine(begin, new MyPoint(4,5));
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint begin = new MyPoint(2,3);
        MyPoint end = new MyPoint(4,5);
        MyLine line = new MyLine(begin,end);
        assertEquals(end, line.getEnd());
    }

    @Test
    void setEnd() {
        MyPoint begin = new MyPoint(2,3);
        MyPoint newEnd = new MyPoint(4,8); //declaro e inicializo newEnd
        MyLine line = new MyLine(new MyPoint(4,5), begin);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void getBeginX() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        assertEquals(2, line.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        line.setBeginX(7);
        assertEquals(7, line.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        assertEquals(3, line.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        line.setBeginY(9);
        assertEquals(9, line.getBeginY());
    }

    @Test
    void getEndX() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        assertEquals(4, line.getEndX());
    }

    @Test
    void setEndX() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void getEndY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        assertEquals(5, line.getEndY());
    }

    @Test
    void setEndY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        line.setEndY(7);
        assertEquals(7, line.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        assertArrayEquals(new int[]{2,3}, line.getBeginXY());
    }

    @Test
    void setBeginXY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        line.setBeginXY(4,7);
        assertArrayEquals(new int[]{4,7}, line.getBeginXY());
    }

    @Test
    void getEndXY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        assertArrayEquals(new int[]{4,5}, line.getEndXY());
    }

    @Test
    void setEndXY() {
        MyLine line = new MyLine(new MyPoint(2,3), new MyPoint(4,5));
        line.setEndXY(8,7);
        assertArrayEquals(new int[]{8,7}, line.getEndXY());
    }

    @Test
    void getLength() {
        MyLine line = new MyLine(new MyPoint(0,0), new MyPoint(4,5));
        assertEquals(Math.sqrt(4*4 + 5*5), line.getLength());
    }

    @Test
    void getGradient() {
        MyLine line = new MyLine(new MyPoint(4,2), new MyPoint(3,2));
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(new MyPoint(3,2), new MyPoint(2,4));
        assertEquals("MyLine [begin =3,2, end =2,4]", line.toString());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(13, 40, 16);
        assertEquals(13, time.getHour());
    }

    @Test
    void getMinute() {
        Time time = new Time(13, 40, 16);
        assertEquals(40, time.getMinute());
    }

    @Test
    void getSecond() {
        Time time = new Time(13, 40, 16);
        assertEquals(16, time.getSecond());
    }

    @Test
    void setHour() {
        Time time = new Time(13, 40, 16);
        time.setHour(16);
        assertEquals(16, time.getHour());
    }

    @Test
    void setMinute() {
        Time time = new Time(13, 40, 16);
        time.setMinute(15);
        assertEquals(15, time.getMinute());
    }

    @Test
    void setSecond() {
        Time time = new Time(13, 40, 16);
        time.setSecond(22);
        assertEquals(22, time.getSecond());
    }

    @Test
    void setTime() {
        Time time = new Time(13, 40, 16);
        time.setTime(11, 45, 17);
        assertEquals(11, time.getHour());
        assertEquals(45, time.getMinute());
        assertEquals(17, time.getSecond());
    }

    @Test
    void testToString() {
        Time time = new Time(9, 7, 27);
        assertEquals("09:07:27", time.toString());
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals(0, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
        assertEquals(23, time.getHour());
        assertEquals(59, time.getMinute());
        assertEquals(59, time.getSecond());
    }
}
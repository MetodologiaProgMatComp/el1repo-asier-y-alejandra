package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cylinder2Test {

    @Test
    void getHeight() {
        Cylinder2 cylinder = new Cylinder2(2.0,3.0, "green");
        assertEquals(3.0, cylinder.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder2 cylinder = new Cylinder2(2.0,3.0, "green");
        cylinder.setHeight(8.0);
        assertEquals(8.0, cylinder.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder2 cylinder = new Cylinder2(2.0,3.0, "green");
        assertEquals(Math.PI*2.0*2.0*3.0, cylinder.getVolume());
    }

    @Test
    void testToString() {
        Cylinder2 cylinder = new Cylinder2(2.0,3.0, "green");
        assertEquals("Cylinder[base=Circle[radius=2.0,color=green],height=3.0]", cylinder.toString());
    }
}
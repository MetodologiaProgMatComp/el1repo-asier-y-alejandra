package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder(2.0,4.0, "orange");
        assertEquals(4.0, cylinder.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder cylinder = new Cylinder(2.0,4.0, "orange");
        cylinder.setHeight(10.0);
        assertEquals(10.0, cylinder.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(2.0,4.0, "orange");
        assertEquals(Math.PI * 2.0 * 2.0 * 4.0, cylinder.getVolume());
    }
}
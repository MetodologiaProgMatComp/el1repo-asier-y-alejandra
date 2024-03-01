package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Point3D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D point = new Point3D(2.0f, 4.0f, 3.0f); //uso la f para asignar un float, ya que si no sería double
        assertEquals(3.0f, point.getZ());
    }

    @Test
    void setZ() {
        Point3D point = new Point3D(2.0f, 4.0f, 3.0f);
        point.setZ(5.0f);
        assertEquals(5.0f, point.getZ());
    }

    @Test
    void setXYZ() {
        Point3D point = new Point3D(2.0f, 4.0f, 3.0f);
        point.setXYZ(1.0f, 2.0f, 3.5f);
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.5f}, point.getXYZ());
    }

    @Test
    void getXYZ() {
        Point3D point = new Point3D(2.0f, 4.0f, 3.0f);
        assertArrayEquals(new float[]{2.0f, 4.0f, 3.0f}, point.getXYZ());
    }

    @Test
    void testToString() {
        Point3D point = new Point3D(2.0f, 4.0f, 3.0f);
        assertEquals("(2.0,4.0,3.0)", point.toString());
    }
}
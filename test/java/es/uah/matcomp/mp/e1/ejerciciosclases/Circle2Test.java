package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void getRadius() {
        Circle2 circle = new Circle2(); //Usamos el constructor Circle1
        assertEquals(1.0, circle.getRadius()); //Ver que el radio es igual a 1
    }

    @Test
    void setRadius() {
        Circle2 circle = new Circle2();
        circle.setRadius(2.0); //Establecemos el radio en 2
        assertEquals(2.0, circle.getRadius()); //Vemos que el radio se ha actualizado correctamente
    }

    @Test
    void getArea() {
        Circle2 circle = new Circle2(3.0);
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea()); //Verificamos que el área es igual a pi*radio^2

    }

    @Test
    void getCircumference() {
        Circle2 circle = new Circle2(4.0);
        assertEquals(2 * Math.PI * 4.0, circle.getCircumference()); //Verificamos que la circunferencia es igual a 2*PI*r
    }

    @Test
    void testToString() {
        Circle2 circle = new Circle2(5.0);
        assertEquals("Circle [radius=5.0]", circle.toString()); //Verificamos que el método toString devuelve lo que queremos
    }
}
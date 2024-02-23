package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno1;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno1ejs.Circle1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle1Test {

    @Test
    void getRadius() {
        Circle1 circle = new Circle1(); //Utilizamos el constructor new Circle1
        assertEquals(1.0, circle.getRadius()); //Comprobamos si el valor que que queremos obtener es el que la funcion proporciona(en este caso el 1)
    }

    @Test
    void getArea() {
        Circle1 circle = new Circle1(2.0); //Utilizamos de nuevo el constructor pero inicializado en 2, diciendo asi que el radio es = 2
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea()); //Comprobamos si el resultado que debería dar (PI*radio^2) es el que da el programa
    }
}
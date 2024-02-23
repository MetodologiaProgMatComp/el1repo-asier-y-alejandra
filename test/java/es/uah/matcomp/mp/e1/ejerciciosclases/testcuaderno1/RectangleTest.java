package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno1;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno1ejs.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f); //Creamos una instancia
        assertEquals(3.0f, rectangle.getLength()); //Verificamos que devuelva la longitud correcta
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f);
        rectangle.setLength(5.0f); //Establecemos otro valor
        assertEquals(5.0f, rectangle.getLength()); //Comprobamos que se haya modificado correctamente
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f); //Creamos una instancia
        assertEquals(4.0f, rectangle.getWidth()); //Verificamos que devuelva la longitud correcta
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f);
        rectangle.setWidth(7.0f); //Establecemos otro valor
        assertEquals(7.0f, rectangle.getWidth()); //Comprobamos que se haya modificado correctamente
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f);
        assertEquals(12.0, rectangle.getArea()); //Verificamos que devuelva el área correcta
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f);
        assertEquals(14.0, rectangle.getPerimeter()); //Verificamos que nos devuelve el perimetro correcto
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(3.0f, 4.0f);
        assertEquals("Rectangle[lenght=3.0, width=4.0]", rectangle.toString()); //Comprobamos que nos devuelve la cadena correcta
    }
}
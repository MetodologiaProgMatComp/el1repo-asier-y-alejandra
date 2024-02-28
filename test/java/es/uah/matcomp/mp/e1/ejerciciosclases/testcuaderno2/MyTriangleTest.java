package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno2;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs.MyTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(1,2,3,4,6,5);
        assertEquals("MyTriangle[v1=(1,2),v2=(3,4),v3=(6,5)]", triangle.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle triangle = new MyTriangle(1,2,3,4,6,5);
        double lado1 = triangle.getV1().distance(triangle.getV2());
        double lado2 = triangle.getV2().distance(triangle.getV3());
        double lado3 = triangle.getV3().distance(triangle.getV1());

        double Perimetro = lado1 + lado2 + lado3;
    }

    @Test
    void getType() {
        //triángulo con los 3 lados iguales, debería ser equilátero
        MyTriangle triangle = new MyTriangle(3,2,3,2,3,2);
        assertEquals("Equilátero", triangle.getType());

        //triángulo con los 2 lados iguales, debería ser isósceles
        MyTriangle triangle1 = new MyTriangle(3,2,3,2,8,7);
        assertEquals("Isósceles", triangle1.getType());

        //triángulo con los 3 lados desiguales, debería ser escaleno
        MyTriangle triangle2 = new MyTriangle(3,8,7,5,1,2);
        assertEquals("Escaleno", triangle2.getType());
    }


    //pruebo que los métodos nuevos que he creado me muestren los puntos correctos con sus coordenadas
    @Test
    void getV1() {
        MyTriangle triangle = new MyTriangle(1,2,3,4,5,6);
        assertEquals((new MyPoint(1,2)).getX(), triangle.getV1().getX());
        assertEquals((new MyPoint(1,2)).getY(), triangle.getV1().getY());
    }

    @Test
    void getV2() {
        MyTriangle triangle = new MyTriangle(1,2,3,4,5,6);
        assertEquals((new MyPoint(3,4)).getX(), triangle.getV2().getX());
        assertEquals((new MyPoint(3,4)).getY(), triangle.getV2().getY());
    }

    @Test
    void getV3() {
        MyTriangle triangle = new MyTriangle(1,2,3,4,5,6);
        assertEquals((new MyPoint(5,6)).getX(), triangle.getV3().getX());
        assertEquals((new MyPoint(5,6)).getY(), triangle.getV3().getY());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.*; // el * sirve para incluir todo

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle4 =  new Circle4(2.0);
        GeometricObject rectangle3 = new Rectangle3(2.0,4.0);

        System.out.println("Circle: " + circle4.toString());
        System.out.println("Area: " + circle4.getArea());
        System.out.println("Perimeter: " + circle4.getPerimeter());

        System.out.println();

        System.out.println("Rectangle: " + rectangle3.toString());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
    }
}

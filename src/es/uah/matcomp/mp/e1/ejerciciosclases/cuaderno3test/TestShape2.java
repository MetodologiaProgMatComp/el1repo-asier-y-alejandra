package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Shape2;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Circle3;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Rectangle2;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Square2;

public class TestShape2 {
    public static void main(String[] args) {

        // Upcast Circle to Shape (polimorfismo reflejado ya que trato un objeto de una clase derivada como si fuera de la clase base)
        Shape2 s1 = new Circle3(5.5, "red", false);
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//System.out.println(s1.getRadius()); //ERROR: este método no existe en la clase Shape2

        // Downcast back to Circle (polimorfismo reflejado ya que trato un objeto de una clase derivada como si fuera de la clase base)
        Circle3 c1 = (Circle3) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


// Upcast (polimorfismo reflejado ya que trato un objeto de una clase derivada como si fuera de la clase base)
        Shape2 s3 = new Rectangle2(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //ERROR: este método no exite en la clase Shape2

// downcast (polimorfismo reflejado ya que trato un objeto de una clase derivada como si fuera de la clase base)
        Rectangle2 r1 = (Rectangle2) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

// Upcast (polimorfismo reflejado ya que trato un objeto de una clase derivada como si fuera de la clase base)
        Shape2 s4 = new Square2(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //ERROR: este metodo no existe en la clase

        // Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle2 r2 = (Rectangle2) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); //ERROR: este método no existe en la clase Rectangle2
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square (polimorfismo reflejado ya que trato un objeto de una clase derivada como si fuera de la clase base)
        Square2 sq1 = (Square2) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        //System.out.println(sq1.getLength()); ////ERROR: este método no existe en la clase Square2
    }
}

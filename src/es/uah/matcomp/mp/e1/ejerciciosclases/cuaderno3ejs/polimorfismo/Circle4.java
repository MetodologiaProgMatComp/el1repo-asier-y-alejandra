package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class Circle4 implements GeometricObject {
    private double radius;

    public Circle4(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

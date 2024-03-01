package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class Rectangle3 implements GeometricObject{
    private double width;
    private double length;
    public Rectangle3(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2*(width + length);
    }
}

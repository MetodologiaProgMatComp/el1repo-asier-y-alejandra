package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs;

public class Cylinder2 {
    private Circle base; // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinder2() {
        this.base = new Circle(); // Call the constructor to construct the Circle
        this.height = 1.0;
    }

    public Cylinder2(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ",height=" + height + "]";
    }
}

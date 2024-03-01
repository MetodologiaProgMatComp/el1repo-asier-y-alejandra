package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class Circle5 implements GeometricObject{
    protected double radius;
    public Circle5(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle[radius="+radius+"]";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}

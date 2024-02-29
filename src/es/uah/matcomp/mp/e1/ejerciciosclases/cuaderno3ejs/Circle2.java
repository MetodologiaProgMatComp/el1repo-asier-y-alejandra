package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs;

public class Circle2 extends Shape{
    private double radius;

    //lo de poner super() significa que estamos llamando al constructor de la super clase que en este caso es Shape
    public Circle2(){
        super();
        this.radius= 1.0;
    }
    public Circle2(double radius){
        super();
        this.radius=radius;
    }
    public Circle2(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius="+radius+"]"; //Llamamos al toString de la superclase
    }
}

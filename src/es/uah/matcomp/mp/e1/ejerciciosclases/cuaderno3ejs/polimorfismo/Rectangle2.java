package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class Rectangle2 extends Shape2{
    protected double widht;
    protected double length;

    public Rectangle2(){
        super();
        this.widht=1.0;
        this.length=1.0;
    }
    public Rectangle2(double widht,double length){
        super();
        this.widht=widht;
        this.length=length;
    }
    public Rectangle2(double widht,double length,String color,boolean filled){
        super(color, filled);
        this.widht=widht;
        this.length=length;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return widht*length;
    }
    public double getPerimeter(){
        return 2*widht+2*length;
    }
    @Override
    public String toString(){
        return "Rectangle["+super.toString()+",width="+widht+",length="+length+"]";
    }
}


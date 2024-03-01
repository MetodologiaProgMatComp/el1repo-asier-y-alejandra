package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class Square2 extends Rectangle2 {
    public Square2() {
        super();
    }

    public Square2(double side) {
        super(side, side);
    }

    public Square2(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidht(); //Como un cuadrado tiene los lados iguales, da igual coger width o length
    }

    public void setSide(double side) {
        setWidht(side);
        setLength(side);
    }

    @Override
    public void setWidht(double side) {
        super.setWidht(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidht(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}



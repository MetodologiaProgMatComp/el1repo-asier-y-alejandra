package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class ResizableCircle extends Circle5 implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle["+super.toString()+"]";
    }

    @Override
    public void resize(int percent) {
        radius *=percent/100.0;
    }
}

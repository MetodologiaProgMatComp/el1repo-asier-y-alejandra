package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Circle5;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.ResizableCircle;

public class TestResizable {
    public static void main(String[] args){
        //Crear circulo
        Circle5 circle5=new Circle5(6.0);
        System.out.println("Perimetro del circulo:"+circle5.getPerimeter());
        System.out.println("Area del circulo:"+circle5.getArea());

        //Usar resize
        ResizableCircle resizableCircle=new ResizableCircle(4.0);
        System.out.println("ResizableCircle:"+resizableCircle);
        resizableCircle.resize(50); //Redimensionar al 50%
        System.out.println("Despues de redimensionar al 50%:"+resizableCircle);
    }
}

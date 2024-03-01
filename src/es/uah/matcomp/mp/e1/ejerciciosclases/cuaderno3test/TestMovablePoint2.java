package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Movable;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.MovablePoint2;

public class TestMovablePoint2 {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint2(1,2,3,4);
        System.out.println("Inicio: " + movablePoint.toString());
        movablePoint.moveUp(); //por ejemplo, y =- ySpeed
        System.out.println("Posición final: " + movablePoint.toString());
    }
}

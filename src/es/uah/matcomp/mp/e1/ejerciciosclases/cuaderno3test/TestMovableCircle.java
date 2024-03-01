package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.MovableCircle;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        System.out.println("MovableCircle: " + circle.toString());
        circle.moveRight(); //por ejemplo, x += xSpeed
        System.out.println("Posición final: " + circle.toString());
    }
}

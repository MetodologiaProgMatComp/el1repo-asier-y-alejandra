package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.MovablePoint;

public class MovablePoint2 implements Movable { //no necesito abstract ya la clase proporciona implementaciones completas para todos los métodos de la interfaz
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint2(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") speed=(" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

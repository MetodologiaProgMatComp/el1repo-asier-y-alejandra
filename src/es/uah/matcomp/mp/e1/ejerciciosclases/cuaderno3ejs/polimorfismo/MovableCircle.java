package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint2 center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint2(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

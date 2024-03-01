package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia;

public class LineSub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end; // Ending point

    // Constructors
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }

    public LineSub(Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return "Linea desde " + super.toString() + " hasta " + end.toString();
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(int x, int y) {
        super.setXY(x, y);
    }

    public void setEnd(int x, int y) {
        end.setXY(x, y);
    }

    public int getBeginX() {
        return (int) super.getX();
    }

    public int getBeginY() {
        return (int) super.getY();
    }

    public int getEndX() {
        return (int) end.getX();
    }

    public int getEndY() {
        return (int) end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {  // Length of the line, cambio de int a double para en el test obtener el decimal y no un numero entero poco exacto
        int xDiff = (int) (end.getX() - super.getX());
        int yDiff = (int) (end.getY() - super.getY());
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() { // Gradient in radians
        int xDiff = (int) (end.getX() - super.getX());
        int yDiff = (int) (end.getY() - super.getY());
        return Math.atan2(yDiff, xDiff);
    }
}

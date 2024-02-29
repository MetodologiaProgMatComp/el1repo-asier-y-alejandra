package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public Line(Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY); // construct the Points here
        this.end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return "Linea desde " + begin + " hasta " + end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return (int) begin.getX();
    }

    public int getBeginY() {
        return (int) begin.getY();
    }

    public int getEndX() {
        return (int) end.getX();
    }

    public int getEndY() {
        return (int) end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() { // Length of the line, cambio de int a double para en el test obtener el decimal y no un numero entero poco exacto
        int xDiff = (int) (end.getX() - begin.getX()); //casteao, transformo a int
        int yDiff = (int) (end.getY() - begin.getY());
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() { // Gradient in radians // Math.atan2(yDiff, xDiff)
        int xDiff = (int) (end.getX() - begin.getX()); //casteao, transformo a int
        int yDiff = (int) (end.getY() - begin.getY());
        return Math.atan2(yDiff, xDiff);
    }
}


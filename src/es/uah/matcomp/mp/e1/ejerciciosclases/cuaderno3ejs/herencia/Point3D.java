package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }
    public Point3D() {
        this(0.0f, 0.0f, 0.0f);
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    //sin override ya que el método no anula ni implementa un método de un supertipo
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}

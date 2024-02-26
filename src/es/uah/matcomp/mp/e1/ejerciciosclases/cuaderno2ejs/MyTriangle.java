package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1); //utilizo la distancia de MyPoint() para calcular el perimetro
    }

    public String getType() {
        double lado1 = v1.distance(v2); //defino el tipo de lado y lo que representa
        double lado2 = v2.distance(v3);
        double lado3 = v3.distance(v1);

        if (lado1 == lado2 && lado2 == lado3) { //los 3 lados son iguales
            return "Equilátero"; //el triángulo es equilátero
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) { //2 lados iguales y 1 desigual
            return "Isósceles"; //el triángulo es isósceles
        } else {
            return "Escaleno"; //si no se cumple ninguna de las condiciones anteriores, el triángulo tiene los 3 lados desiguales por lo que es escaleno
        }
    }


    //creo 3 nuevos métodos para usarlos en el test y tener los datos más accesibles
    public MyPoint getV1() {
        return v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public MyPoint getV3() {
        return v3;
    }
}

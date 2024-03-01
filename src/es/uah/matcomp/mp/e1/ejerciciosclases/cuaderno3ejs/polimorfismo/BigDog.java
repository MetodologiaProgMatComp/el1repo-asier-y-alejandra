package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo;

public class BigDog extends Dog2{
    public BigDog(String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog2 another) {
        System.out.println("Woooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}

package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs;

public class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Animal[name="+name+"]";
    }
}

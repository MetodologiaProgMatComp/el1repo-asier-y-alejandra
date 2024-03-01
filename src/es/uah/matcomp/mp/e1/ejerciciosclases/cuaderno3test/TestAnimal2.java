package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;


import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Animal2;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.BigDog;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Cat2;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.polimorfismo.Dog2;

public class TestAnimal2 {
    public static void main(String[] args){
        Animal2 cat=new Cat2("Misi");
        Animal2 dog=new Dog2("Loki");
        Animal2 bigdog=new BigDog("Royer");

        System.out.println("Cat:");
        cat.greets();
        System.out.println("Dog:");
        dog.greets();
        System.out.println("BigDog:");
        bigdog.greets();


        System.out.println("Dog another:");
        ((Dog2)dog).greets(new Dog2("Rich"));
        System.out.println("BigDog greets another Dog:");
        ((BigDog)bigdog).greets(new Dog2("Luck"));
        System.out.println("BigDog greets another BigDog:");
        ((BigDog)bigdog).greets(new BigDog("Rich")); //(BigDog) indica que bigdog, que es de tipo animal, se convertira en un objeto de tipo BigDog. Hay que hacerlo porque bigdog se declara como animal






    }
}

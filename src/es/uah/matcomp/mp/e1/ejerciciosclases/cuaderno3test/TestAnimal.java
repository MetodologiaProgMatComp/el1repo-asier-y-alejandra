package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3test;


import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Animal;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Dog;
import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.Mammal;

public class TestAnimal {
    public static void main(String[] args){
        Animal animal=new Animal("Animal");
        Mammal mammal=new Mammal("Mammal");
        Cat cat=new Cat("Pili");
        Dog dog=new Dog("Charlie");

        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog);

        //Llamar a greets de dog
        dog.greets();
        //LLamar a greets(another) de Dog
        Dog dog1=new Dog("Willy");
        System.out.println(dog1);
        dog.greets(dog1);

        /*animal.greets(); //Si itentamos llamar a animal.greets daria error ya que animal no tiene el método greets.*/
    }
}
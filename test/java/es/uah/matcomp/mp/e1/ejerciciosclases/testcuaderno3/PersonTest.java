package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person("Pepa Romero", "Cifuentes 28");
        assertEquals("Pepa Romero", person.getName());
    }

    @Test
    void getAddress() {
        Person person = new Person("Pepa Romero", "Cifuentes 28");
        assertEquals("Cifuentes 28", person.getAddress());
    }

    @Test
    void setAddress() {
        Person person = new Person("Pepa Romero", "Cifuentes 28");
        person.setAddress("Pintor Rosal");
        assertEquals("Pintor Rosal", person.getAddress());
    }

    @Test
    void testToString() {
        Person person = new Person("Pepa Romero", "Cifuentes 28");
        assertEquals("Person[name=Pepa Romero, address=Cifuentes 28]" , person.toString());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        assertEquals("Programación", student.getProgram());
    }

    @Test
    void setProgram() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        student.setProgram("Álgebra");
        assertEquals("Álgebra", student.getProgram());
    }

    @Test
    void getYear() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        assertEquals(2024, student.getYear());
    }

    @Test
    void setYear() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        student.setYear(2025);
        assertEquals(2025, student.getYear());
    }

    @Test
    void getFee() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        assertEquals(400.0, student.getFee());
    }

    @Test
    void setFee() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        student.setFee(500.0);
        assertEquals(500.0, student.getFee());
    }

    @Test
    void testToString() {
        Student student = new Student("Pepa Romero", "Cifuentes 28", "Programación", 2024, 400.0);
        assertEquals("Student[Person[name=Pepa Romero, address=Cifuentes 28], program =Programación, year =2024, fee =400.0]", student.toString());
    }
}
package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno1;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno1ejs.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000); //Creamos una instancia
        assertEquals(1, employee.getId()); //Verificamos que el metodo get.Id() devuelve el id correcto
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals("Manolo", employee.getFirstName()); //Verificamos si nos devuelve el nombre
    }

    @Test
    void getLastName() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals("Rodriguez", employee.getLastName()); //Verificamos si nos devuelve el apellido
    }

    @Test
    void getName() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals("Manolo Rodriguez", employee.getName()); //Verificamos si nos devuelve el nombre completo
    }

    @Test
    void getSalary() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals(1000, employee.getSalary()); //Verificamos que nos devuelve el salario correcto

    }

    @Test
    void setSalary() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        employee.setSalary(1200); //Establecemos un nuevo salario
        assertEquals(1200, employee.getSalary()); //Verificamos que el salario se ha actualizado bien

    }

    @Test
    void getAnnualSalary() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals(12000, employee.getAnnualSalary()); //Comprobamos si devuelve el salario anual correcto
    }

    @Test
    void raiseSalary() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals(1200, employee.raiseSalary(20)); //Verificamos si nos devuelve el salario correcto tras aumentarlo en un 20%
    }

    @Test
    void testToString() {
        Employee employee = new Employee(1, "Manolo", "Rodriguez", 1000);
        assertEquals("Employee[id=1,name=Manolo Rodriguez,salary=1000]", employee.toString()); //Vemos si devuelve la cadena completa correcta
    }
}
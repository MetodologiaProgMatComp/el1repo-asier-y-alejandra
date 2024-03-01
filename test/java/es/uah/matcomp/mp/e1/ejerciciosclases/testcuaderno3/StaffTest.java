package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff staff = new Staff("Pepa Romero", "Serrano", "UAH", 2500.0);
        assertEquals("UAH", staff.getSchool());
    }

    @Test
    void setSchool() {
        Staff staff = new Staff("Pepa Romero", "Serrano", "UAH", 2500.0);
        staff.setSchool("URJC");
        assertEquals("URJC", staff.getSchool());
    }

    @Test
    void getPay() {
        Staff staff = new Staff("Pepa Romero", "Serrano", "UAH", 2500.0);
        assertEquals(2500.0, staff.getPay());
    }

    @Test
    void setPay() {
        Staff staff = new Staff("Pepa Romero", "Serrano", "UAH", 2500.0);
        staff.setPay(4000.0);
        assertEquals(4000.0, staff.getPay());
    }

    @Test
    void testToString() {
        Staff staff = new Staff("Pepa Romero", "Serrano", "UAH", 2500.0);
        assertEquals("Staff[Person[name=Pepa Romero, address=Serrano], school=UAH, pay=2500.0]", staff.toString());
    }
}
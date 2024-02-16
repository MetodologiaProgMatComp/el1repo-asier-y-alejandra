package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(1,1,2024); //Creamos una instancia
        assertEquals(1,date.getDay()); //Verificamos que devuelve el dia correcto

    }

    @Test
    void getMonth() {
        Date date = new Date(1,1,2024);
        assertEquals(1, date.getMonth()); //Verificamos que devuelve el mes correcto
    }

    @Test
    void getYear() {
        Date date = new Date(1,1,2024);
        assertEquals(2024,date.getYear()); //Verificamos que devuelve el año correcto

    }

    @Test
    void setDay() {
        Date date = new Date(1,1,2024);
        date.setDay(2); //Cambiamos el dia
        assertEquals(2,date.getDay()); //Comprobamos que devuelve el dia modificado
    }

    @Test
    void setMonth() {
        Date date = new Date(1,1,2024);
        date.setMonth(2); //Cambiamos el mes
        assertEquals(2,date.getMonth()); //Comprobamos que devuelve el mes modificado
    }

    @Test
    void setYear() {
        Date date = new Date(1,1,2024);
        date.setYear(2025); //Cambiamos el año
        assertEquals(2025,date.getYear()); //Comprobamos que devuelve el dia modificado
    }

    @Test
    void setDate() {
        Date date = new Date(1,1,2024);
        date.setDate(3,4,2021); //Cambiamos la fecha
        assertEquals(3,date.getDay()); //Comprobamos que devuelve el dia modificado
        assertEquals(4,date.getMonth()); //Comprobamos que devuelve el mes modificado
        assertEquals(2021,date.getYear()); //Comprobamos que devuelve el año modificado
    }

    @Test
    void testToString() {
        Date date = new Date(1,1,2024);
        assertEquals("01/01/2024",date.toString()); //Comprobamos que nos devuelve la cadena correcta
    }
}
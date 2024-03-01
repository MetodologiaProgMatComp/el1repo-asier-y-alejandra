package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno3;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno3ejs.herencia.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square=new Square(5.0);
        assertEquals(5.0,square.getSide());
    }

    @Test
    void setSide() {
        Square square=new Square(5.0);
        square.setSide(6.0);
        assertEquals(6.0,square.getSide());
    }

    @Test
    void setWidht() {
        Square square=new Square(5.0);
        square.setWidht(6.0);
        assertEquals(6.0,square.getSide());
    }

    @Test
    void setLength() {
        Square square=new Square(5.0);
        square.setLength(7.0);
        assertEquals(7.0,square.getSide());
    }

    @Test
    void testToString() {
        Square square=new Square(5.0,"red",true);
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=5.0,length=5.0]]",square.toString());

    }
}
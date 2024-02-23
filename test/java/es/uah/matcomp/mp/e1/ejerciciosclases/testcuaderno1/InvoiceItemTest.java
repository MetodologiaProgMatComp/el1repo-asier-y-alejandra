package es.uah.matcomp.mp.e1.ejerciciosclases.testcuaderno1;

import es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno1ejs.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0); //Creamos una instacia
        assertEquals("001", item.getId()); //Verificamos que el método getId() nos devuelve la id
    }

    @Test
    void getDesc() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        assertEquals("Producto 1", item.getDesc()); //Verificamos que devuelva la descripción correcta
    }

    @Test
    void getQty() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        assertEquals(2, item.getQty()); // Verificamos que devuelva la cantidad correcta
    }

    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        item.setQty(3); //Establecemos una nueva cantidad
        assertEquals(3, item.getQty()); //Verificamos que la cantidad se ha actualizado correctamente
    }

    @Test
    void getUnitPrice() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        assertEquals(10.0, item.getUnitPrice()); //Verificamos que devuelva el metodo unitario correcto
    }

    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        item.setUnitPrice(15.0); //Establecemos un nuevo valor de precio unitario;
        assertEquals(15.0, item.getUnitPrice()); //Verificamos que se ha actualizado correctamente
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        assertEquals(20.0, item.getTotal()); //Verificamos que devuelva el total correcto
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("001", "Producto 1", 2, 10.0);
        assertEquals("InvoiceItem[id=001,desc=Producto 1,qty=2,unitPrice=10.0]", item.toString()); //Verificamos que devuelva la cadena correcta
    }
}
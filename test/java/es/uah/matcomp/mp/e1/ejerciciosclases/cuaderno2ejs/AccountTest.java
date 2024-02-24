package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno2ejs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account account = new Account(1, new Customer2(2, "Fran Olmos", 'M'), 1000.0);
        assertEquals(1, account.getId());
    }

    @Test
    void getCustomer() {
        Customer2 customer = new Customer2(2, "Fran Olmos", 'M');
        Account account = new Account(1, customer, 1000.0);
        assertEquals(customer, account.getCustomer());
    }

    @Test
    void getBalance() {
        Account account = new Account(1, new Customer2(2,"Fran Olmos", 'M'), 1000.0);
        assertEquals(1000.0, account.getBalance(), 0.05);
    }

    @Test
    void setBalance() {
        Account account = new Account(1, new Customer2(2, "Fran Olmos", 'M'), 1000.0);
        account.setBalance(500.0);
        assertEquals(500.0, account.getBalance(), 0.05);
    }

    @Test
    void testToString() {
        Account account = new Account(1, new Customer2(2, "Fran Olmos", 'M'), 1000.0);
        assertEquals("Fran Olmos (1) balance=$1000.0", account.toString());
    }

    @Test
    void getCustomerName() {
        Account account = new Account(1, new Customer2(2, "Fran Olmos", 'M'), 1000.0);
        assertEquals("Fran Olmos", account.getCustomerName());
    }

    @Test
    void deposit() {
        Account account = new Account(1, new Customer2(2, "Fran Olmos", 'M'), 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.05);
    }

    @Test
    void withdraw() {
        Account account = new Account(1, new Customer2(2, "Fran Olmos", 'M'), 1000.0);
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance(), 0.05);
    }
}
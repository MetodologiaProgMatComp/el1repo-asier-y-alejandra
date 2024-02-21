package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account account = new Account("123", "Luis González");
        assertEquals("123", account.getId());
    }

    @Test
    void getName() {
        Account account = new Account("123", "Luis González");
        assertEquals("Luis González", account.getName());
    }

    @Test
    void getBalance() {
        Account account = new Account("123", "Luis González", 10000);
        assertEquals(10000, account.getBalance());
    }

    @Test
    void credit() {
        Account account = new Account("456", "Luis González");
        assertEquals(200, account.credit(200));
    }

    @Test
    void debit() {
        Account account = new Account("456", "Luis González", 10000);
        assertEquals(9800, account.debit(200));
        assertEquals(9600, account.debit(200));
        assertEquals(9600,account.getBalance());
    }

    @Test
    void transferTo() {
        Account account1 = new Account("123", "Luis González", 10000);
        Account account2 = new Account("789", "María Díaz");

        assertEquals(9900, account1.transferTo(account2,100));
        assertEquals(9900,account1.getBalance());
        assertEquals(100, account2.getBalance());

        assertEquals(9700, account1.transferTo(account2,200));

        assertEquals(9700, account1.getBalance());
        assertEquals(300, account2.getBalance());
    }

    @Test
    void testToString() {
        Account account = new Account("123", "Luis González", 10000);
        assertEquals("Account[id=123,nameLuis González,balance=10000]", account.toString());
    }
}
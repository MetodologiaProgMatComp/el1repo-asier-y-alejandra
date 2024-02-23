package es.uah.matcomp.mp.e1.ejerciciosclases.cuaderno1ejs;

public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name) {
        this.id = id;
        this. name = name;
        this.balance = 0; //inicializar a 0
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        this.balance += amount; //añadir amount a balance
        return this.balance; // devolver el balance
    }
    public int debit(int amount) {
        if(amount <= this.balance) { //si amount es menor o igual que balance
            this.balance -= amount; //restar amount de balance
        }else{ //se ejecuta este bloque de código si, y solo si, la condición anterior no se cumple
            System.out.println("Amount exceeded balance"); //si no se cumple la condicion anterior, se imprimirá por pantalla el siguiente mensaje
        }
        return this.balance; //devolver balance
    }
    public int transferTo(Account another, int amount) {
        if(amount<=this.balance) { //se ejecutará si amount es menor o igual que balance
            this.balance -= amount; //retiro amount de balance
            another.credit(amount); //transfiero amount a otra cuenta
        }else{ //se ejecuta este bloque de código si, y solo si, la condición anterior no se cumple
            System.out.println("Amount exceeded balance"); //si no se cumple la condicion anterior, se imprimirá por pantalla el siguiente mensaje
        }
        return this.balance; //devolver balance
    }
    public String toString() {
        return "Account[id=" + id + ",name" + name + ",balance=" + balance + "]";
    }
}

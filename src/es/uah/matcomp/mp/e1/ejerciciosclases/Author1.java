package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Author1 {
    private String name;
    private String email;
    private char gender;

    public Author1(String name, String email, char gender){
        this.name = name;
        this.email = email;
        //Vemos que el valor sea m o f
        if (gender == 'm' || gender == 'f') { //el "or" es "||"
            this.gender = gender;
        }else { // si no se cumple lo anterior, establecemos otro valor
            this.gender = 'x'; //char va con una ' ' y no con " "
        }
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ",gender=" + gender + "]";
    }
}









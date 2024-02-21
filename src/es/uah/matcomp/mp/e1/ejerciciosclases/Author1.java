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
    public String toString(){
        return "Author [name=" + name + ", email=" + email + ",gender=" + gender + "]";
    }

    //TEST
    public static void main(String[] args) {
        Author1 ahTeck = new Author1("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck); // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName()); // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail()); // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test
    }
}









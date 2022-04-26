package Curso_Java.Arrays.Sobrecarga_de_Metodos;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String output() {
        return this.firstName.toUpperCase() + " " + this.lastName.toUpperCase();
    }

    public String output(boolean showLastName) {
        if (showLastName) {
            return output();
        }
        else {
            return this.firstName;
        }
    }

}

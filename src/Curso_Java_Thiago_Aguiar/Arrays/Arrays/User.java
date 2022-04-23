package Curso_Java_Thiago_Aguiar.Arrays.Arrays;

public class User {

    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase().trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase().trim();
    }

    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase().trim();
        this.lastName = lastName.toUpperCase().trim();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return "\n" + this.firstName + " " + this.lastName + "\n";
    }

}

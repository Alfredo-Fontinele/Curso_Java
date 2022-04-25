package Curso_Java.Arrays.ArrayList;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase().trim();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase().trim();
    }

    public String getLastName() {
        return this.lastName;
    }

}

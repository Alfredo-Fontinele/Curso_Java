package POO_Parte2_Getters_Setters;

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
        return "\nFirst Name: " + this.firstName + "\n";
    }

    public String getLastName() {
        return "\nLast Name: " + this.lastName + "\n";
    }

    public String getFullName() {
        return "\n" + this.firstName + " " + this.lastName + "\n";
    }

}

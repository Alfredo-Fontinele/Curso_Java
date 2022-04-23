package Curso_Java_Thiago_Aguiar.Arrays.POO_Parte3_Construtor;

public class User {

    // Properties of Class
    private String firstName;
    private String lastName;

    // Constructor of Class
    public User(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase().trim();
        this.lastName = lastName.toUpperCase().trim();
    }

    public String getFullName() {
        try {
            return "\n" + this.firstName + " " + this.lastName + "\n";
        }
        catch (Exception error) {
            System.out.println(error.getMessage());
        }
        finally {
            System.out.println("\nOperation completed successfully\n");
        }
        return null;
    }

    public void setFullName(String firstName, String lastName) {
        try {
            this.firstName = firstName.toUpperCase().trim();
            this.lastName = lastName.toUpperCase().trim();
        }
        catch (Exception error) {
            System.out.println("Problem => " + error.getMessage());
        }
        finally {
            System.out.println("\nOperation completed successfully\n");
        }
    }
}




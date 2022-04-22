package Programacao_Orientada_a_Objetos;

public class User {

    public String firstName;
    public String lastName;

    private String fullName;
    public String password;

    public String getFullName() {
        fullName = firstName + ' ' + lastName;
        return fullName;
    }

}

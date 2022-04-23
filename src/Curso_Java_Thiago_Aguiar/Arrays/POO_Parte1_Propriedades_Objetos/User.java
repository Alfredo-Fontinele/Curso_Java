package Curso_Java_Thiago_Aguiar.Arrays.POO_Parte1_Propriedades_Objetos;

public class User {

    public String firstName;
    public String lastName;

    private String fullName;
    public String password;

    public String getFullName() {
        fullName = this.firstName + ' ' + this.lastName;
        return fullName;
    }

}

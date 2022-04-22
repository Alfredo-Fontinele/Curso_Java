package Programacao_Orientada_a_Objetos;

public class App {

    public static void main(String[] args) {

        User userA = new User();

        userA.firstName = "Alfredo";
        userA.lastName = "Neto";
        userA.password = "12345678";

        User userB = new User();

        userB.firstName = "Joao";
        userB.lastName = "Silva";
        userB.password = "12345678910";

        String fullName = userA.getFullName();
        System.out.println(fullName);

    }



}

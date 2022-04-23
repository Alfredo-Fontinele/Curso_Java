package POO_Parte1_Propriedades_Objetos;

public class App {

    public static void main(String[] args) {

        User userA = new User();

        userA.firstName = "Alfredo";
        userA.lastName = "Neto";
        userA.password = "12345678";

        String fullName_userA = userA.getFullName();
        System.out.println(fullName_userA);

        User userB = new User();

        userB.firstName = "Joao";
        userB.lastName = "Silva";
        userB.password = "12345678910";

        String fullName_userB = userB.getFullName();
        System.out.println(fullName_userB);

    }



}

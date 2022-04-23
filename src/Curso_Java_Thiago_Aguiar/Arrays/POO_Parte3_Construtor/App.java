package Curso_Java_Thiago_Aguiar.Arrays.POO_Parte3_Construtor;

public class App {

    public static void main(String[] args) {

        User[] users = new User[] {
                new User("Alfredo", "Neto"),
                new User("Amanda", "Fontinele"),
                new User("Monia", "Silva")
        };

        for (var i = 0; i < users.length; i++) {
            System.out.println(users[i].getFullName());
        }
    }
}

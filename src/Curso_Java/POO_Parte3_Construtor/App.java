package Curso_Java.POO_Parte3_Construtor;
public class App {
    public static void main(String[] args) {

        User[] users = new User[] {
                new User("Teste1", "Teste1.1"),
                new User("Teste2", "Teste2.1"),
                new User("Teste3", "Teste3.1")
        };

        for (var i = 0; i < users.length; i++) {
            System.out.println(users[i].getFullName());
        }
    }
}

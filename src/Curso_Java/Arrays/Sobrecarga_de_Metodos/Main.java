package Curso_Java.Arrays.Sobrecarga_de_Metodos;

public class Main {

    public static void main(String[] args) {

        User userA = new User("Alfredo", "Neto");

        // Múltiplos métodos com o mesmo nome, mas com aplicação diferente
        // Ex: o método add do ArrayList
        // um metodo add que adiciona um elemento no fim da lista
        // E outro metodo add que recebe como parametros um indice e um elemento para inserir nesse respectivo indice

        System.out.println(userA.output());

        System.out.println(userA.output(false));

    }

}

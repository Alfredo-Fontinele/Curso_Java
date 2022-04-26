package Curso_Java.Arrays.Hashcode_e_Equals;

public class Main {

    public static void main(String[] args) {

        // exemplo 1:

        User userA = new User("Alfredo", "Neto");
        User userB = new User("teste", "teste");

        System.out.println("\nCodigo Hash da variavel userA: " + userA.hashCode());
        System.out.println("Codigo Hash da variavel userB: " + userB.hashCode());

        System.out.println("o firstName do userA e igual ao firstName do userB?: " + userA.equals(userB)); // false

        // exemplo 2:

        User userC = new User("Alfredo", "Neto");
        User userD = new User("Alfredo", "teste");

        System.out.println("\nCodigo Hash da variavel userC: " + userC.hashCode());
        System.out.println("Codigo Hash da variavel userD: " + userD.hashCode());

        System.out.println("o firstName do userC e igual ao firstName do userD?: " + userC.equals(userD)); // false

    }

}

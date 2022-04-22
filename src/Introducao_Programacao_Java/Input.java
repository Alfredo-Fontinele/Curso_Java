package Introducao_Programacao_Java;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String name = scanner.nextLine();

        System.out.println("\nOla " + name + ". Seja bem-vindo ao Intellij Idea Java\n");
    }

}

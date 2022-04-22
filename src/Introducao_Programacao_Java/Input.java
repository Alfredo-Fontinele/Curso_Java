package Introducao_Programacao_Java;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nDigite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\n\t- Nome Informado:" + nome + "\n\t- Idade Informada: " + idade + " anos\n");
    }

}

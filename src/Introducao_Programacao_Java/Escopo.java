package Introducao_Programacao_Java;
import java.util.Scanner;

public class Escopo {

    public static void main(String[] args) {
        // Escopo de Variáveis com Condições

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();

        System.out.println("\nDados do Usuario\n\n\t-Nome Informado: " + nome + "\n\t-Idade Informada: " + idade + " anos");

    }

}

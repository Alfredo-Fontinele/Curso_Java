package Introducao_Programacao_Java;

import java.util.Scanner;

public class Comparando_Strings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = "1234567";

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        if (senha.equals(password)) {
            System.out.println("\nSenha Validada com Sucesso\n");
        }

        else {
            System.out.println("\nSenha Incorreta\n");
        }

    }

}

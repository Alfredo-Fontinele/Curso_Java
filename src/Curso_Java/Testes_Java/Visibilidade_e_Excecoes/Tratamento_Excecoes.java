package Curso_Java.Testes_Java.Visibilidade_e_Excecoes;

import java.util.Scanner;

public class Tratamento_Excecoes {

    public static void main(String[] args) {
        Sum();
    }

    public static void Sum() {
        try {
            // Ao digitar os valores com casas decimais, ao ínves de ter que digitar '.' para simbolizar a casa decimal,
            // em Java, se digita a vírgula normalmente
            // Ex: First Value: 10,23
            // Ex: Second Value: 38,78

            Scanner scanner = new Scanner(System.in);

            System.out.println("\nFirst Value: ");
            double v1 = scanner.nextDouble();

            System.out.println("\nSecond Value: ");
            double v2 = scanner.nextDouble();

            double result = v1 + v2;

            System.out.println("\nResult of Sum: " + result);
        }
        catch (Exception error) {
            System.out.println("\nErro Identificado => " + error.getMessage() + "\n");
        }
        finally {
            System.out.println("\nFinished Operation\n");
        }
    }

}

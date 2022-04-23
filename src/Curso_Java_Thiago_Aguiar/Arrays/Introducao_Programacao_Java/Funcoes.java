package Curso_Java_Thiago_Aguiar.Arrays.Introducao_Programacao_Java;
public class Funcoes {

    public static void main(String[] args) {
        Sum(20, 10);
        Sub(20, 10);
        Mul(20, 10);
        Div(20, 10);
    }

    static void Sum(int num1, int num2) {
        var resultado = num1 + num2;
        System.out.println("\n\t- Resultado da Soma: " + resultado);
    }

    static void Sub(int num1, int num2) {
        var resultado = num1 - num2;
        System.out.println("\n\t- Resultado da Subtacao: " + resultado);
    }

    static void Mul(int num1, int num2) {
        var resultado = num1 * num2;
        System.out.println("\n\t- Resultado da Multiplicacao: " + resultado);
    }

    static void Div(int num1, int num2) {
        var resultado = num1 / num2;
        System.out.println("\n\t- Resultado da Divisao: " + resultado);
    }

}

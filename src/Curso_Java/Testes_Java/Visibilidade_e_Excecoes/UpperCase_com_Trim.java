package Curso_Java.Testes_Java.Visibilidade_e_Excecoes;

public class UpperCase_com_Trim {

    public static void main(String[] args) {

        String frase = "    hello world    ";

        var fraseValidada = frase.toUpperCase().trim();

        System.out.println(frase);
        System.out.println(fraseValidada);

    }
}

package Testes_Java;

public class UpperCase_com_Trimp {

    public static void main(String[] args) {

        String frase = "    hello world    ";

        var fraseValidada = frase.toUpperCase().trim();

        System.out.println(frase);
        System.out.println(fraseValidada);

    }
}

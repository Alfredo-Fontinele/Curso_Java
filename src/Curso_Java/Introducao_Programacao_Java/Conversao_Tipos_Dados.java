package Curso_Java.Introducao_Programacao_Java;

public class Conversao_Tipos_Dados {

    public static void main(String[] args) {

        // Converter Tipos Primitivos (Casting)

        // 1º Exemplo

        double d = 10.87485465465;
        short c = 32;

        System.out.println("\n\t-Tipo Double (64bits): " + (d + c));

        var resultado_nao_convertido = d + c;
        float resultado_convertido = (float) d + c;  // Convertendo o tipo Double para o tipo Float
        System.out.println("\n\t-Tipo Float (32bits): " + resultado_convertido);


        // 2º Exemplo

//        double x = 5000.456456;
//        int y = 500;
//        var resultado1 = (x/y);
//        var resultado2 = (int) (x/y);
//        System.out.print("\nResultado Double: " + resultado1);
//        System.out.print("\n\nResultado Convertido para Inteiro: " + resultado2 + "\n\n");


    }

}

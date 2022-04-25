package Curso_Java.Arrays.Preenchendo_Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        String[] names = new String[10];

        System.out.println("\nArray sem a funcao fill\n");
        System.out.println(Arrays.toString(names));

        Arrays.fill(names, "Desconhecido"); // to fill => Preencher => Preenchimento

        System.out.println("\nArray com a funcao fill\n");
        System.out.println(Arrays.toString(names));

    }

}

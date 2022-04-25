package Curso_Java.Arrays.Comparando_Arrays;

import java.util.Arrays;

public class Comparacao {

    public static void main(String[] args) {

        int[] lista1 = new int[] { 1,2,3 };
        int[] lista2 = new int[] { 1,2,3 };

        System.out.println("");
        System.out.println(lista1 == lista2);
        System.out.println(lista1.equals(lista2));

        // Mas, se eu comparar as hashs, isto é, os espaços de memória em que estão alocados as minhas variáveis

        System.out.println("Hash da lista 1: " + lista1);
        System.out.println("Hash da lista 2: " + lista2);

        // Mas, e se eu comparar valores armazenados nos espaços de memória em que estão alocados as minhas variáveis

        System.out.println(Arrays.equals(lista1, lista2));

    }

}

package Curso_Java.Arrays.Ordenar_Array;

import java.util.Arrays;

public class Ordenacao {

    public static void main(String[] args) {

        int[] numbers = new int[]{10,30,3,2,1,5,2,3,10};  // Criando uma Lista de inteiros com varias numeros

        Ordernar(numbers);
    }

    public static void Ordernar(int[] array) {
        Arrays.sort(array);
        System.out.println("\nArray Ordenado => " + Arrays.toString(array));
    }


}

package Curso_Java.Arrays.Lista_Comum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista_Comum {

    public static void main(String[] args) {

        String[] names = {"Alfredo", "Neto"}; // Lista Simples porém, não possuti métodos de manipulação de array

        System.out.format("\n\nLista Original: %s", Arrays.toString(names));

        List<String> lista = new ArrayList<>(); // Lista Dinâmica porém, possuti métodos de manipulação de array
        lista.add("Teste");

        System.out.println("\n\nLista Dinamica: " + lista);

    }
}

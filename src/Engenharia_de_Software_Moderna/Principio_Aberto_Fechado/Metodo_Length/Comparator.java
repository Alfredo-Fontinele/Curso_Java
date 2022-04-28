package Engenharia_de_Software_Moderna.Principio_Aberto_Fechado.Metodo_Length;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Comparator {

    public static void main(String[] args) {

        List<String> nomes;
        nomes = Arrays.asList("Joao", "Maria", "Alexandre", "Ze");

        java.util.Comparator<String> comparador = new java.util.Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        Collections.sort(nomes, comparador);
        System.out.format("Nomes Ordenados pelo seu tamanho:\n %s", nomes);
    }
}

package Curso_Java.Arrays.Ordenacao_e_forEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar {

    public static void main(String[] args) {

        List<String> lista_nomes = new ArrayList<>(); // Lista Dinâmica

        lista_nomes.add("teste 5");
        lista_nomes.add("teste 3");
        lista_nomes.add("teste 1");
        lista_nomes.add("teste 2");

        // Nesse caso, ainda que tenhamos colocado numeros entre aspas, isto é, Strings
        // o comando Collections.sort(lista_nomes) irá ordernar os seus elementos
        // com base nesses "números strings"

        Collections.sort(lista_nomes);

        // forEach => para cada elemento da lista, a gente vai pegar esse item de volta
        for (String nome : lista_nomes) {
            System.out.println(nome);
        }

    }

}

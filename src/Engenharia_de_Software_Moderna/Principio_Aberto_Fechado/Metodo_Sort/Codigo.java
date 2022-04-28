package Engenharia_de_Software_Moderna.Principio_Aberto_Fechado.Metodo_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Codigo {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes = Arrays.asList("joao", "maria", "alexandre", "ze");
        Collections.sort(nomes);

        System.out.println(nomes);

    }

}

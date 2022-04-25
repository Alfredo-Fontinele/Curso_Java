package Curso_Java.Arrays.Metodos_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Teste_Metodos {

    public static void main(String[] args) {

        Metodos method = new Metodos();

        List<String> lista = new ArrayList<>();

        lista.add("Alfredo");
        lista.add("Mateus");
        lista.add("João");
        lista.add("Lucas");

        method.elementByIndex(lista, "Alfredo");

    }

}

package Curso_Java.Arrays.Metodos_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Metodos {

    public Metodos() {
        super();
    }

    public static void main(String[] args) {

        // String[] => Array Fixo
        // new ArrayList<String>() => Array Dinâmico

        List<String> Names = new ArrayList<>();

        // 1º) Como adicionar elementos no Array?

        Names.add("Alfredo");
        Names.add("Neto");
        Names.add("Lucas");
        Names.add("Mateus");

        // 2º) Como buscar elementos pelo índice no Array?

        for (int i = 0; i < Names.size(); i++) {
            System.out.println(Names.get(i));
        }

        // 3º) Como identificar um elemento pelo indice?

        int index = Names.indexOf("Alfredo");
        System.out.format("\nElemento: %s\nIndice do Elemento: %s\n", Names.get(index), index);

        // 4º) Verificando se a lista está vazia

        System.out.println(Names.isEmpty());

        // 5º) Verificando se a lista contem um determinado elemento

        System.out.println(Names.contains("Alfredo"));

        // 6º) Verificando o tamanho da lista

        System.out.println(Names.size());

        // 7º) Limpando a lista de 2 formas

        // 1º forma

         Names = null;

        // 2º forma

        Names.clear();
        Names.isEmpty(); //verificando se a lista está vazia

    }

    public void elementByIndex(List list, String index_element) {
        int result = list.indexOf(index_element);
        System.out.format("\nElemento: %s\nIndice do Elemento: %s\n", list.get(result), result);
    }

}

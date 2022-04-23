package Curso_Java_Thiago_Aguiar.Arrays.Introducao_Programacao_Java;

public class Manipulando_Strings {

    public static void main(String[] args) {

        String x = "Ola mundo. Esse e o novo mundo";

        System.out.println("=============================================================================================================================================");

        System.out.println("\n1- toUpperCase => Texto em Maiusculo:\n");
        System.out.println("\tResposta: " + x.toUpperCase());

        System.out.println("\n2- toLowerCase => Texto em Minusculo:\n");
        System.out.println("\tResposta: " + x.toLowerCase());


        System.out.println("\n3- Length => Tamanho do Texto:\n");
        System.out.println("\tResposta: " + x.length() + " caracteres");

        System.out.println("\n4- Verificando se o texto tem a palavra 'novo':\n");
        System.out.println("\tResposta: " + x.contains("novo"));

        System.out.println("\n5- Verificando se o texto tem a palavra 'Novo':\n");
        System.out.println("\tResposta: " + x.contains("Novo"));

        System.out.println("\n6- Verificando se o texto tem a palavra 'java':\n");
        System.out.println("\tResposta: " + x.contains("java"));

        System.out.println("\n7- A partir de qual caractere comeca a palavra pela 'Mundo' primeira vez:\n");
        System.out.println("\tResposta: Comeca a partir do indice: " + x.indexOf("mundo"));

        System.out.println("\n8- A partir de qual caractere comeca a palavra 'Mundo' pela ultima vez:\n");
        System.out.println("\tResposta: Termina a partir do indice: " + x.lastIndexOf("mundo"));

        String y = "     Teste de espaco     ";

        System.out.println("\n9- Removendo espacos da esquerda e direita (semelhante ao strip() do Python) da variavel 'y':\n");
        System.out.println("\tResposta: " + y.trim());

        System.out.println("\n10- Mostrando uma frase a partir de um caractere especificado, nesse caso, o numero 9:\n");
        System.out.println("\tResposta: " + x.substring(9));

        String z = "Java";

        System.out.println("\n11- Verificando se uma variavel possui um valor identico a uma outra palavra, nesse caso, 'Java' com a primeira letra em maiusculo:\n");
        System.out.println("\tResposta: " + z.equals("Java"));

        System.out.println("\n12- Verificando se uma variavel possui um valor identico, nesse caso, 'java' com a primeira letra em minusculo:\n");
        System.out.println("\tResposta: " + z.equals("java"));

        System.out.println("=============================================================================================================================================");

    }

}

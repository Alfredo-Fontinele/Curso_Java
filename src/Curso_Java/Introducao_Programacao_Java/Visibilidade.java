package Curso_Java.Introducao_Programacao_Java;

public class Visibilidade {

    private static void main(String[] args) {
        // Visibilidade de Escopo - Public ou Private

        // Vá na Pasta Curso_Java.Testes_Java no arquivo Teste, veja que na linha 9 só aparece a função Sum,
        // Pois só ela está com o método public
        // o Sub não aparece pois tem a propriedade private

        Sum(10, 3);
    }

    public static void Sum(int x, int y) {
        System.out.println(x + y);
    }

    private static void Sub(int x, int y) {
        System.out.println(x - y);
    }

}

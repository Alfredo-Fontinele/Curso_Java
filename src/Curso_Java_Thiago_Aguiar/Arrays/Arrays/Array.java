package Curso_Java_Thiago_Aguiar.Arrays.Arrays;

public class Array {

    public static void main(String[] args) {

        // 1º) Criando um vetor vazio com 3 espaços de memória vazios

        User[] users = new User[3];

        // 2º) Criando 3 usuários

        User alfredo = new User();
        alfredo.setFullName("Alfredo", "Neto");

        User luis = new User();
        luis.setFullName("Luis", "Fernando");

        User mark = new User();
        mark.setFullName("Mark", "Zuckerberg");

        // 3º) Inserindo os usuários criados no vetor

        users[0] = alfredo;
        users[1] = luis;
        users[2] = mark;

        // 4º) Printando na tela todos os usuários (Nome Completo) do meu vetor

        for (var i = 0; i < users.length; i++) {
            System.out.println(users[i].getFullName());
        }

    }

}

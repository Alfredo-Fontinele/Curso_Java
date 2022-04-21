package Introduacao_Programacao_Java;
import java.util.Random;

// Ele vai sortear um número de 0 a 60 e mostrá-lo na tela. Vai fazer esse processo 6 vezes
public class While {

    public static void main(String[] args) {

        Random generate = new Random();

        int i = 1;

        while (i <= 6) {
            int number = generate.nextInt(60);
            System.out.println(i + "- Numero => " + number);
            i++;
        }

    }

}

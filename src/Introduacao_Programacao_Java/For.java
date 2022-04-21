package Introduacao_Programacao_Java;
import java.util.Random;

public class For {

    public static void main(String[] args) {

        Random generate = new Random();

        for (int i = 0; i <= 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(i + "- Numero => " + number);
        }

    }

}

package Curso_Java.Testes_Java.Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type a number:");

        int f1 = 0;
        int f2 = 1;
        int limit = input.nextInt();

        System.out.println("================================");
        System.out.println("\nFibonacci's Sequence");

        while (f2 < limit) {
            int fn = f1 + f2;
            if (fn > limit) {
                break;
            }
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }

        System.out.println("\n================================");
    }

}



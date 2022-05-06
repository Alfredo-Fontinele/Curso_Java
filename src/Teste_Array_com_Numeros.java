import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste_Array_com_Numeros {
    public static void main(String[] args) {
        whileNotZero();
    }

    public static void whileNotZero() {
        try {
            Scanner input = new Scanner(System.in);
            List<Double> lista = new ArrayList<>();
            while (true) {
                System.out.println("Digite um numero: ");
                var numero = input.nextDouble();
                if (numero == 0) {
                    System.out.format("\nLista Completa: %s\n", lista);
                    break;
                } else {
                    lista.add(numero);
                }
            }
        }
        catch (Exception error) {
            System.out.println("\nIdentificando erro(s) => [" + error.getMessage() + "]\n");
        }
        finally {
            System.out.println("\nCodigo Executado\n");
        }
    }
}
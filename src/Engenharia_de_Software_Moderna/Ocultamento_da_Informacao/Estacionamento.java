package Engenharia_de_Software_Moderna.Ocultamento_da_Informacao;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

// Esta classe está na página 156 do livro: "Engenharia de Software Moderna";

public class Estacionamento {

    private final Hashtable<String, String> veiculos;

    public Estacionamento() {
        veiculos = new Hashtable<>();
    }

    public void estaciona(String placa,String veiculo) {
        veiculos.put(placa, veiculo);
    }

    public static void main(String[] args) {

        Estacionamento e = new Estacionamento();

        e.estaciona("TCP-7030", "Uno");
        e.estaciona("BNF-4501", "Gol");
        e.estaciona("JKL-3481", "Corsa");

    }

}

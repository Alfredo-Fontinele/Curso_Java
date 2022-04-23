package Testes_Java;

// link da aula => https://www.youtube.com/watch?v=D7YhkUjl0P8

public class Carro {

    // Declaração das Variáveis
    // final => é para transformar as variaveis abaixo em constantes (imutáveis);

    private final String fabricante;
    private final String modelo;
    private final int ano;
    private final boolean motorLigado;
    private final int velocidade;

    public void detalhes() {
        System.out.println("Fabricante: " + this.fabricante);
    }

    // Método Construtor Completo
    public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
        super();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.motorLigado = motorLigado;
        this.velocidade = velocidade;
    }


}

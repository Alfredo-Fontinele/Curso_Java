package Curso_Java.Testes_Java.Classes_Java.Carro;

// Acesse este link para saber sobre formatação de Strings no Java
// https://receitasdecodigo.com.br/java/o-basico-sobre-java-string-format#:~:text=Ent%C3%A3o%2C%20como%20alternativa%2C%20podemos%20utilizar,%2C%20name%2C%20day%2C%20month)

public class Carro {

    private String fabricante;
    private String modelo;
    private int ano;
    private boolean motorLigado;
    private int velocidade;

    // Construtor Simples
    public Carro() {
        super();
    }

    // Construtor Completo
    public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
        super();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.motorLigado = motorLigado;
        this.velocidade = 0;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isMotorLigado(boolean motorLigado) {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String situacaoMotor() {
        try {
            if (!this.motorLigado) {
                return "\nSistema Ligado\n";
            }
            else {
                this.motorLigado = false;
                return "\nSistema Desligado\n";
            }
        }
        catch (Exception error) {
            return String.format("\nProblema(s) Identificado(s): \n\t[%s]\n", error.getMessage());
        }
    }

    public String ligarMotor() {
        if (this.motorLigado) {
            return "\nSistema já estava ligado.\n";
        }
        else {
            this.motorLigado = true;
            return "\nSistema foi ligado agora\n";
        }
    }

    public String desligarMotor() {
        if (!this.motorLigado) {
            return "\nSistema já estava desligado.\n";
        }
        if (this.velocidade == 0) {
            this.motorLigado = false;
            return "\nO motor foi desligado";
        }
        else {
            return "\nO motor não foi desligado pois o carro está em movimento\n";
        }
    }

    public String getAllInformations() {
        try {
            var frase = String.format("""
                ================================================
                           INFORMACOES SOBRE O CARRO
                ================================================
                            
                \t1- Fabricante: %s
                \t2- Modelo: %s
                \t3- Ano: %s
                \t4- Motor Ligado: %s
                \t5- Velocidade: %s km/h
                            
                ================================================
            """, this.fabricante, this.modelo, this.ano, this.motorLigado, this.velocidade);

            return String.format("\n%s\n", frase);
        }
        catch (Exception error) {
            return String.format("\nProblema(s) Identificado(s): \n\t[%s]\n", error.getMessage());
        }
    }

}







// OBSERVAÇÕES SOBRE A CLASSE ACIMA


// Construtor Simples
// ele existe pro caso de eu querer fazer isto:
//
//  Carro c1 = new Carro();
//  c1.setFabricante = "Lamborghini";
//  c1.setModelo = "Gallardo";
//  c1.setAno = 2020;
//  c1.setMotorLigado = false;
//  c1.setVelocidade = 0;


// Construtor Completo
// ele existe pro caso de eu querer fazer isto:
//
//  Carro c1 = new Carro("Lamborghini", "Gallardo", 2020, false, 0);
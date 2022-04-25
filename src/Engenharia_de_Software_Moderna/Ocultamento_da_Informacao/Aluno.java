package Engenharia_de_Software_Moderna.Ocultamento_da_Informacao;

public class Aluno {

    private int matricula;
    private String nome;

    public Aluno(String nome, int matricula) {
        this.nome = nome.toUpperCase().trim();
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getInformacoes() {
        var frase = String.format("""
        ===========================================================
                                INFORMACOES
        ===========================================================
        
        Nome do Aluno: %s
        Numero de Matricula: %s
        
        ===========================================================     
                
        """, this.nome, this.matricula);
        System.out.println(frase);
    }


    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("    Alfredo Pereira Fontinele Neto    ", 12345);

        aluno1.getInformacoes();

    }

}

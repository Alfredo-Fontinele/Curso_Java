package Curso_Java.Testes_Java.Classes_Java.Usuario;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    private String nome;
    private int idade;
    private int rg;
    private String cpf;

    public Usuario() {
        super();
    }

    public Usuario(String nome, int idade, int rg, String cpf) {
        super();
        this.nome = nome.toUpperCase().trim();
        this.idade = idade;
        this.rg = rg;
        this.cpf = formatCPF(cpf);
    }

    public void setAllInformations() {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("\nDigite seu Nome:");
            String nome = input.nextLine();

            System.out.println("\nDigite sua Idade:");
            int idade = input.nextInt();

            System.out.println("\nDigite seu RG:");
            int rg = input.nextInt();

            System.out.println("\nDigite seu CPF:");
            String cpf = input.nextLine();
            formatCPF(cpf);

            this.nome = nome;
            this.idade = idade;
            this.rg = rg;
            this.cpf = cpf;

            System.out.println("\nDados Cadastrados com Sucesso\n");
        }
        catch (Exception error) {
            System.out.println("\nErro(s) Encontrado(s) => " + error.getMessage() + "\n");
        }
    }

    public String formatCPF(String cpf) {
        Pattern pattern = Pattern.compile("(/d{3})(/d{3})(/d{3})(/d{2})");
        Matcher matcher = pattern.matcher(cpf);
        if (matcher.matches()) {
            cpf = matcher.replaceAll("$1.$2.$3-$4");
        }
        return cpf;
    }

    public void getAllInformations () {
        var frase = String.format("""
                \n
                ===========================================================
                                        INFORMATIONS
                ===========================================================
                        
                1- Nome: %s
                2- Idade: %s ano(s)
                3- RG: %s
                4- CPF: %s
                        
                ===========================================================
                """, this.nome, this.idade, this.rg, this.cpf);
        System.out.println(frase);
    }
}
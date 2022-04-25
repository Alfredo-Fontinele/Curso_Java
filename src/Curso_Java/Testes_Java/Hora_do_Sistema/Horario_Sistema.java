package Curso_Java.Testes_Java.Hora_do_Sistema;

import java.util.Date;
public class Horario_Sistema {

    public static void main(String[] args) {

        Date relogio = new Date();

        var result = String.format("\nHorario do Sistema: \n\t%s", relogio);
        System.out.println(result);

    }

}

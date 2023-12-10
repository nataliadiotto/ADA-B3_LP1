package Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        calcularSalario("Maria", 120, 12.50);
        calcularSalario("João", 80, 15);
        calcularSalario("José", 135, 25.50);

    }
    public static void calcularSalario(String nome, double horasTrabalhadas, double valorHora) {
        double salario = horasTrabalhadas * valorHora;
        System.out.printf("%nFuncionário: %s " +
                "%nSalário: R$%.2f %n", nome, salario);
    }

}

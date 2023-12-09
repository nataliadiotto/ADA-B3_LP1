package Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas quer calcular?");
        int qtNotas = sc.nextInt();

        int i = 1;
        double acumulador = 0;
        while (i <= qtNotas) {
            System.out.printf("Insira a nota %d: %n", i);
            double nota = sc.nextDouble();
            acumulador += nota;
            i++;
        }

        double media = acumulador / qtNotas;
        System.out.printf("Média: %.2f", media);

        sc.close();
    }
}

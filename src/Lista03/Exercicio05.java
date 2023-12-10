package Lista03;

import java.util.Locale;

public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        calcularCombustivel(2.5, 80.0);
        calcularCombustivel(3, 100.0);

    }

    public static void calcularCombustivel(double tempo, double velocidade) {
        if (velocidade < 0 || tempo < 0) {
            System.out.println("A velocidade média e o tempo não podem ser negativos.");

        }

        double consumoPorLitro = 12.0;
        double distancia = tempo * velocidade;
        double totalCombustivel = distancia / consumoPorLitro;
        System.out.printf("%n Para percorrer %.2fkm, serão necessários %.3f litros de combustível.",
                distancia, totalCombustivel);
    }


}

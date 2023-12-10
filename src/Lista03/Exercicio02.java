package Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static double converterTemperatura(double tempAtual, String escalaAtual, String escalaFinal) {
        double tempFinal = 0;
        //celsius
        if (escalaAtual.equals("celsius")) {
            switch (escalaFinal) {
                case "kelvin":
                    tempFinal = tempAtual + 273.15;
                    break;
                case "fahrenheit":
                    tempFinal = tempAtual * 1.8 + 32;
                    break;
                default:
                    System.out.println("Escala final inválida!");
            }
        //kelvin
        } else if (escalaAtual.equals("kelvin")) {
            switch (escalaFinal) {
                case "celsius":
                    tempFinal = tempAtual - 273.15;
                    break;
                case "fahrenheit":
                    tempFinal = (tempAtual - 273.15) * 1.8 + 32;
                    break;
                default:
                    System.out.println("Escala final inválida!");
            }
        //farenheit
        } else if (escalaAtual.equals("fahrenheit")) {
            switch (escalaFinal) {
                case "celsius":
                    tempFinal = (tempAtual - 32) / 1.8;
                    break;
                case "kelvin":
                    tempFinal = (tempAtual - 32) * 5 / 9 + 273.15;
                    break;
                default:
                    System.out.println("Escala final inválida!");
            }
        } else {
            System.out.println("Escala atual inválida!");
        }
        return tempFinal;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a temperatura atual: ");
        double tempAtual = sc.nextDouble();

        System.out.print("Insira a escala de medida atual (celsius | kelvin | fahrenheit): ");
        String escalaAtual = sc.next().toLowerCase();
        System.out.print("Insira a escala de medida final (celsius | kelvin | fahrenheit): ");
        String escalaFinal = sc.next().toLowerCase();
        System.out.println();

        double tempFinal = converterTemperatura(tempAtual, escalaAtual, escalaFinal);
        System.out.printf("Temperatura atual: %.2f %n" +
                "Escala atual: %s %n" +
                "Escala final: %s %n" +
                "Output: %.2f", tempAtual, escalaAtual, escalaFinal, tempFinal);

        sc.close();
    }

}

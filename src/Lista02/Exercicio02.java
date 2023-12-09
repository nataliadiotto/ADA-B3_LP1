package Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Escolha uma das operações:\n" +
                "1. Somar\n" +
                "2. Subtrair\n" +
                "3. Dividir\n" +
                "4. Multiplicar\n" +
                "5. Resto\n" +
                "6. Raiz\n" +
                "7. Potência");

        char operacao = sc.next().charAt(0);

        System.out.print("\nInsira o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Insira o segundo número: ");
        double num2 = sc.nextDouble();

        double total = 0;
        switch (operacao) {
            case '1':
                System.out.println(total = num1 + num2);
                break;
            case '2':
                System.out.println(total = num1 - num2);
                break;
            case '3':
                if (num2 != 0) {
                    System.out.println(total = num1 / num2);
                    break;
                } else {
                    System.out.println("Não é permitido dividir por zero");
                    break;
                }
            case '4':
                System.out.println(total = num1 * num2);
                break;
            case '5':
                System.out.println(total = num1 % num2);
                break;
            case '6':
                System.out.println(Math.sqrt(num1));
                System.out.println(Math.sqrt(num2));
                break;
            case '7':
                total = Math.pow(num1, num2);
                System.out.println(total);
                break;
        }

        sc.close();
    }
}

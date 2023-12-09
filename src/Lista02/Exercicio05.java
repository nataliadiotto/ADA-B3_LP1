package Lista02;

import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {

        int num = 7;

        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);

    }
}

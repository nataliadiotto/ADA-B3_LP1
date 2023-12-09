package Lista02;

import java.util.Locale;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int x = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d %n", x, i ,(x * i));
        }
    }
}

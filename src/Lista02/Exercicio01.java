package Lista02;

import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int x = 18;

        //check if its even
        if (x % 2 == 0) {
            if (x >= 2 && x <= 5) {
                System.out.println("Not Weird");
            } else if (x >= 6 && x <= 20) {
                System.out.println("Weird");
            } else if (x > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
        

    }
}

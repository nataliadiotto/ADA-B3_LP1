package Lista03;

import java.util.Scanner;

public class Exercicio03 {

    public static void fatorial(int num){
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial: " + fatorial);

    }

    public static void main(String[] args) {

        fatorial(5);
        fatorial(10);


    }

}

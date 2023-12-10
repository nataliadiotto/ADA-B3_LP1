package Lista04;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //exemplo 01
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{5, 6, 7, 8};
        concatenarArrays(a, b);

        //exemplo 02
        int[] c = new int[]{1, 3, 5, 7};
        int[] d = new int[]{2, 4, 6, 8};
        concatenarArrays(c, d);


    }

    public static void concatenarArrays(int[] a,  int[] b) {
        if (a.length == b.length && a.length != 0) {
            System.out.print("[");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
                System.out.print(", ");
                System.out.print(b[i]);

                if (i < a.length -1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]\n");

            } else {
            System.out.println("Arrays devem ser do mesmo tamanho e não podem ser nulas.");
        }
        }


    }

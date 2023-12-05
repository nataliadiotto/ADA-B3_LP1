package Lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert user's name:");
        String name = sc.nextLine();

        System.out.println("Insert user's age:");
        int age = sc.nextInt();

        System.out.println("Insert user's occupation:");
        String occupation = sc.next();
        System.out.println();

        System.out.println("Name: " + name);
        System.out.printf("Age: %d years old %n", age);
        System.out.print("Occupation: " + occupation);

        sc.close();

    }
}

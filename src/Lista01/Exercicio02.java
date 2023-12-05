package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert user's name:");
        String name = sc.nextLine();

        System.out.println("Insert user's salary:");
        double salary = sc.nextDouble();

        System.out.println("Insert user's age:");
        int age = sc.nextInt();

        System.out.println("Insert user's height:");
        double height = sc.nextDouble();

        System.out.println("Insert user's gender: (M/F/N)");
        char gender = sc.next().charAt(0);

        System.out.println();

        System.out.printf("Name: %s | Salary: $%.2f | Age: %d years old | Height: %.2f | Gender: %c",
                name, salary, age, height, gender);

        sc.close();

    }
}

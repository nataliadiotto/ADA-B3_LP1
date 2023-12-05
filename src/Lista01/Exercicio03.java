package Lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Module 01:"); //max 3 bytes
        System.out.print("Mission's year: ");
        short year = sc.nextShort(); //2 bytes
        System.out.print("Number of employees involved: ");
        byte qtEmployees = sc.nextByte(); //1 byte
        System.out.println();

        System.out.println("Module 02:"); //max 6 bytes
        System.out.print("Satellite's distance from Earth: ");
        float distanceFromEarth = sc.nextFloat(); //4 bytes
        System.out.print("Maximum speed(km/h): ");
        short maxSpeed = sc.nextShort(); //2 bytes
        System.out.println();

        System.out.println("Module 03:"); //max 17 bytes
        System.out.print("Mission's status (Started = true | Not started = false): ");
        boolean status = sc.nextBoolean();  // 1 byte
        System.out.print("Mission's total distance: ");
        double totalDistance = sc.nextDouble(); // 8 bytes
        System.out.print("Antenna calibration: ");
        double calibration = sc.nextDouble(); //8 bytes
        System.out.println();

        System.out.printf("%nModule 1:%n Year: %d | Employees involved: %d %n%n" +
                "Module 2: %n Satellite's distance from Earth: %f | Maximum speed: %d %n%n" +
                "Module 3: %n | Mission's status: %b | Total distance: %f" +
                " | Antenna Calibration: %f", year, qtEmployees, distanceFromEarth, maxSpeed, status, totalDistance, calibration);




        sc.close();

    }
}

//3000000000000
//15000000000000000
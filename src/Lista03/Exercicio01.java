package Lista03;

public class Exercicio01 {

    public static void main(String[] args) {

        somar(10, 5);
        subtrair(10, 5);
        dividir(10, 5);
        mutiplicar(10, 5);

    }

    public static void somar(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("Soma: " + resultado);
    }

    public static void subtrair(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("Subtração: " + resultado);
    }

    public static void dividir(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("Divisão: " + resultado);
    }

    public static void mutiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("Multiplicação: " + resultado);
    }


}

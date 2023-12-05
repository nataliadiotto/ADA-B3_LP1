package Lista01;

public class Exercicio04 {
    public static void main(String[] args) {

        //Retangulo
        double baseRet = 10;
        double alturaRet = 5;
        double areaRetangulo = baseRet * alturaRet;
        System.out.printf("Area do Retangulo: %.2f %n", areaRetangulo);

        //Triangulo
        double baseTri = 15;
        double alturaTri = 10;
        double areaTriangulo = (baseTri * alturaTri) / 2;
        System.out.printf("Area do Triangulo: %.2f %n", areaTriangulo);

        //Circulo
        double raio = 15;
        double areaCirculo = Math.PI * (raio * raio);
        System.out.printf("Area do Circulo: %.4f %n", areaCirculo);

        //Trapezio
        double baseMenorTra = 10;
        double baseMaiorTra = 50;
        double alturaTra = 5;
        double areaTrapezio = (baseMaiorTra + baseMenorTra) * alturaTra / 2.0;
        System.out.printf("Area do Trapezio: %.2f %n", areaTrapezio);

    }
}

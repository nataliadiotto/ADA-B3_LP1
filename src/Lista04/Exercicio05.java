package Lista04;

public class Exercicio05 {

    public static void main(String[] args) {

        Integer[] numeros = {1, 8, 4, 2, 6, 1};
        Integer indicePivot = calcularIndicePivot(numeros);
        System.out.println("Índice pivô: " + indicePivot);

    }

    public static Integer calcularIndicePivot(Integer[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return - 1;
        }

        Integer soma = 0;
        for (Integer numero: numeros) {
            soma += numero;
        }

        Integer somaEsquerda = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (somaEsquerda == soma - somaEsquerda - numeros[i]){
                return i;
            }
            somaEsquerda += numeros[i];
        }
        return -1;

    }

}

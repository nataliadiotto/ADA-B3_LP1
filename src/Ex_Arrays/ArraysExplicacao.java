package Ex_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysExplicacao {

    public static void main(String[] args) {

        //estrutura de dados simples para armazenar uma colecao de elementos

        //forma mais comum de declarar arrays
        int[] arrayDeInt;

        //forma menos comum
        int arrayDeInt2[];

        //inicializando array caso vc ja saiba o numero de elementos
        int[] arrayDeInt3 = new int[10];

        //preenchendo o array
        Integer[] arrayDeInt4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //descobrir o tamanho do array
        int arraySize = arrayDeInt4.length;

        //transformar o array em lista
        List<Integer> itens = Arrays.asList(arrayDeInt4);
        //percorrer o array como lista
        itens.forEach(System.out::println);
        System.out.println();

        //copiar array - copy of range (partes do array)
        String[] treinamento = new String[]{
                "Treinamento",
                "Descomplicando",
                "Java",
                "da",
                "Linux",
                "Tips"};
        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 3);
        List<String> treinamentoNomeList = List.of(treinamentoNome); //outra forma de converter array em list
        treinamentoNomeList.forEach(System.out::println);
        System.out.println();

        //imprimindo array inteiro
        List<String> treinamentoList = List.of(treinamento);
        treinamentoList.forEach(System.out::println);
        System.out.println();

        //nao consegue escolher o range, so pega os dois primeiros
        String[] arrayCom2 = Arrays.copyOf(treinamentoNome, 2);
        List<String> arrayCom2List = List.of(arrayCom2);
        arrayCom2List.forEach(System.out::println);
        System.out.println();

        //preenchendo um array - fill
        String[] java = new String[10];
        Arrays.fill(java, "java");
        List<String> javaList = List.of(java);
        javaList.forEach(System.out::println);
        System.out.println();

        //comparar arrays - equals
        int[] arrayDeIntUm = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayDeIntDois = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Os arrays são iguais? " + Arrays.equals(arrayDeIntUm, arrayDeIntDois));
        System.out.println();

        //sorted
        String[] sorted = Arrays.copyOf(treinamento, 6);
        Arrays.sort(sorted);
        List<String> sortedList = List.of(sorted);
        sortedList.forEach(System.out::println);

    }

}

package Lista04;

import java.util.ArrayList;
import java.util.Locale;

public class Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double[][] notasTurma = {{9, 8, 7, 8}, {10, 9, 8, 9}, {9, 8, 7, 8}};

        calcularMedias(notasTurma);


    }

    public static void calcularMedias(double[][] notasTurma) {

        double somaTurma = 0;

        for (int i = 0; i < notasTurma.length; i++) {
            double somaAluno = 0;

            for (int j = 0; j < notasTurma[i].length; j++) {
                somaAluno += notasTurma[i][j];
            }
            double mediaAluno = somaAluno / notasTurma[i].length;
            System.out.printf("Aluno %d - Média %.1f%n", i, mediaAluno);

            somaTurma += mediaAluno;
        }
        double mediaTurma = somaTurma / notasTurma.length;
        System.out.printf("%nMédia da turma: %.2f%n", mediaTurma);
    }
}



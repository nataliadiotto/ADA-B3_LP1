package ExercicioPOO_01;

import ExercicioPOO_01.Colaboradores.Atendente;
import ExercicioPOO_01.Colaboradores.Funcionario;
import ExercicioPOO_01.Colaboradores.Professor;
import ExercicioPOO_01.Estudantes.Aluno;
import ExercicioPOO_01.Estudantes.AlunoBolsista;
import ExercicioPOO_01.Estudantes.AlunoRegular;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Aluno bolsista = new AlunoBolsista("Pedro Augusto", 19, "Avenida 9 de Julho, 127", "123", "Direito", 879.0);
        bolsista.imprimirInfo();

        Aluno alunoRegular = new AlunoRegular("Maria Joana", 18, "R. Tiradentes, 21", "1234","Química", 490.0);
        alunoRegular.imprimirInfo();

        Funcionario atendente = new Atendente("Arthur Costa", 29, "Av. Limeira, 1471", 160.0, 16.50);
        atendente.imprimirInfo();

        Pessoa professor = new Professor("Patricia Lima", 42, "R. Carlos Gomes, 546", 92.0, 77.0);
        professor.imprimirInfo();

    }

}

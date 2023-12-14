package ExercicioPOO_01.Estudantes;

public class AlunoRegular extends Aluno{

    private Double valorMensalidade;

    public AlunoRegular(String nome, Integer idade, String endereco, String matricula, String curso, Double valorMensalidade) {
        super(nome, idade, endereco, matricula, curso);
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.printf("Valor mensalidade: R$%.2f %n%n", valorMensalidade);

    }
}

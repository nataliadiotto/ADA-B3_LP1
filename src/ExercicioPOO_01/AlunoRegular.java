package ExercicioPOO_01;

public class AlunoRegular extends Aluno{

    private double valorMensalidade;

    public AlunoRegular(String nome, int idade, String endereco, String matricula, String curso, double valorMensalidade) {
        super(nome, idade, endereco, matricula, curso);
        this.valorMensalidade = valorMensalidade;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.printf("Valor mensalidade: R$%.2f %n%n", valorMensalidade);

    }
}

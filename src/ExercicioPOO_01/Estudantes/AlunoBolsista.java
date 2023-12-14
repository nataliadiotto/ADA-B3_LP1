package ExercicioPOO_01.Estudantes;

public class AlunoBolsista extends Aluno{

    private Double valorBolsa;

    public AlunoBolsista(String nome, Integer idade, String endereco, String matricula, String curso, Double valorBolsa) {
        super(nome, idade, endereco, matricula, curso);
        this.valorBolsa = valorBolsa;
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.printf("Valor da bolsa: R$%.2f %n%n", getValorBolsa());

    }
}

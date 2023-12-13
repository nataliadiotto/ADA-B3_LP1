package ExercicioPOO_01;

public class Bolsista extends Aluno{

    private double valorBolsa;

    public Bolsista(String nome, int idade, String endereco, String matricula, String curso, double valorBolsa) {
        super(nome, idade, endereco, matricula, curso);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.printf("Valor da bolsa: R$%.2f %n%n", getValorBolsa());

    }
}

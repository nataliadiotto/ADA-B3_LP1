package ExercicioPOO_01;

public class Atendente extends Funcionario {

    private double salario;

    public Atendente(String nome, int idade, String endereco, double cargaHorariaMensal, double valorHoraTrabalhada) {
        super(nome, idade, endereco, cargaHorariaMensal, valorHoraTrabalhada);
    }

    @Override
    public double calcularSalario() {
        salario = getCargaHorariaMensal() * getValorHoraTrabalhada() + 350;
        return salario;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        calcularSalario();
        System.out.printf("Salário: R$%.2f %n%n", salario);
    }
}

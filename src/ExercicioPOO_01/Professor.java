package ExercicioPOO_01;

public class Professor extends Funcionario{

    private double salario;

    public Professor(String nome, int idade, String endereco, double cargaHorariaMensal, double valorHoraTrabalhada) {
        super(nome, idade, endereco, cargaHorariaMensal, valorHoraTrabalhada);
    }

    @Override
    public double calcularSalario() {
        salario = (getCargaHorariaMensal() * getValorHoraTrabalhada()) + 850.0;
        return salario;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        calcularSalario();
        System.out.printf("Salário: R$%.2f %n%n", salario);

    }
}

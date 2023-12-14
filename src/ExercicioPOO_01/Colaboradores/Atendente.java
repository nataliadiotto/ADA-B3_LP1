package ExercicioPOO_01.Colaboradores;

public class Atendente extends Funcionario {

    private Double salario;

    public Atendente(String nome, Integer idade, String endereco, Double cargaHorariaMensal, Double valorHoraTrabalhada) {
        super(nome, idade, endereco, cargaHorariaMensal, valorHoraTrabalhada);
    }

    @Override
    public Double calcularSalario() {
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

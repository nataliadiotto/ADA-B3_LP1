package ExercicioPOO_01.Colaboradores;

import ExercicioPOO_01.Colaboradores.Funcionario;

public class Professor extends Funcionario {

    private Double salario;

    public Professor(String nome, Integer idade, String endereco, Double cargaHorariaMensal, Double valorHoraTrabalhada) {
        super(nome, idade, endereco, cargaHorariaMensal, valorHoraTrabalhada);
    }

    @Override
    public Double calcularSalario() {
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

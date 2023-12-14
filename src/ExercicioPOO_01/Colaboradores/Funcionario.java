package ExercicioPOO_01.Colaboradores;

import ExercicioPOO_01.Pessoa;

public abstract class Funcionario extends Pessoa {

    private Double cargaHorariaMensal;
    private Double valorHoraTrabalhada;

    public Funcionario(String nome, Integer idade, String endereco, Double cargaHorariaMensal, Double valorHoraTrabalhada) {
        super(nome, idade, endereco);
        this.cargaHorariaMensal = cargaHorariaMensal;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getCargaHorariaMensal() {
        return cargaHorariaMensal;
    }

    public void setCargaHorariaMensal(Double cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public abstract Double calcularSalario();
    @Override
    public void imprimirInfo() {
        System.out.printf("Funcionario: %s %n" +
                        "Idade: %d %n" +
                        "Endereço: %s %n" +
                        "Carga horária mensal: %.1f %n" +
                        "Valor da hora trabalhada: R$%.2f %n", getNome(), getIdade(), getEndereco(), getCargaHorariaMensal(), getValorHoraTrabalhada());

        }
}


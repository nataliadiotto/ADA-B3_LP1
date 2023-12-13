package ExercicioPOO_01;

public abstract class Funcionario extends Pessoa {

    private double cargaHorariaMensal;
    private double valorHoraTrabalhada;

    public Funcionario(String nome, int idade, String endereco, double cargaHorariaMensal, double valorHoraTrabalhada) {
        super(nome, idade, endereco);
        this.cargaHorariaMensal = cargaHorariaMensal;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double getCargaHorariaMensal() {
        return cargaHorariaMensal;
    }

    public void setCargaHorariaMensal(double cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public abstract double calcularSalario();
    @Override
    public void imprimirInfo() {
        System.out.printf("Funcionario: %s %n" +
                        "Idade: %d %n" +
                        "Endereço: %s %n" +
                        "Carga horária mensal: %.1f %n" +
                        "Valor da hora trabalhada: R$%.2f %n", getNome(), getIdade(), getEndereco(), getCargaHorariaMensal(), getValorHoraTrabalhada());

        }
}


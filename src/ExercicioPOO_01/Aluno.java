package ExercicioPOO_01;

public abstract class Aluno extends Pessoa{

    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String endereco, String matricula, String curso) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimirInfo() {
        System.out.printf("Aluno: %s %n" +
                        "Idade: %d %n" +
                        "Endereço: %s %n" +
                        "Matrícula: %s %n" +
                        "Curso: %s %n", getNome(), getIdade(), getEndereco(), getMatricula(), getCurso());

    }

}

package Level5_02;

public class Empregado extends Pessoa {

    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public double valorInss() {
        return salario * 0.11;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}

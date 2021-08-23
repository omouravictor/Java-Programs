package Level5_02;

public class Gerente extends Empregado {

    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Nome Gerente: " + getNome() + " | Idade: " + getIdade() + " | Matrícula: " + getMatricula() + " | Gerência: " + getNomeGerencia() + " | Valor INSS: R$" + String.valueOf(valorInss()).replace(".", ",");
    }

}

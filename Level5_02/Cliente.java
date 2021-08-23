package Level5_02;

public class Cliente extends Pessoa {

    private double valorDivida;
    int anoNascim;

    public Cliente(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    @Override
    public String toString() {
        return "Nome Cliente: " + getNome() + " | Idade: " + getIdade() + " | Sexo: " + getSexo() + " | Valor divida: R$" + String.valueOf(valorDivida).replace(".", ",") + " | Ano Nasc: " + anoNascim;
    }

}

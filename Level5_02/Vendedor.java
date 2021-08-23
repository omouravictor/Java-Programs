package Level5_02;

public class Vendedor extends Empregado {

    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Nome Vendedor: " + getNome() + " | Salario: R$" + String.valueOf(getSalario()).replace(".", ",") + " | Valor vendas: R$" + String.valueOf(getValorVendas()).replace(".", ",") + " | Quantidade vendas: " + qntVendas;
    }

}

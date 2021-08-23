package Level6_03;

public class Automovel extends Veiculo {

    private float qtdOleoAtual;

    public Automovel() {
        velocidadeAtual = 0;
        qtdOleoAtual = 0;
    }

    public Automovel(float velocidadeAtual, float qtdOleoAtual) {
        this.velocidadeAtual = velocidadeAtual;
        this.qtdOleoAtual = qtdOleoAtual;
    }

    @Override
    public float acelerar(float velocidade) {
        return velocidadeAtual += velocidade;
    }

    @Override
    public void parar() {
        velocidadeAtual = 0;
    }

    public void trocarOleo(float litros) {
        qtdOleoAtual += litros;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public float getQtdOleoAtual() {
        return qtdOleoAtual;
    }

    public void setQtdOleoAtual(float qtdOleoAtual) {
        this.qtdOleoAtual = qtdOleoAtual;
    }

}

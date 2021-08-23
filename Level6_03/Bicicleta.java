package Level6_03;

public class Bicicleta extends Veiculo {

    @Override
    public float acelerar(float velocidade) {
        return velocidadeAtual += velocidade;
    }

    @Override
    public void parar() {
        velocidadeAtual = 0;
    }

}

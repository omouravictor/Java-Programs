package Level6_02;

public class Resultado {

    private String nomeEspecie; // nome da especie
    private int quantidade; // quantidade de animais da especie

    public Resultado(String nomeEspecie, int quantidade) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

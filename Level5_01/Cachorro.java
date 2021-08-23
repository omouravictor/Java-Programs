package Level5_01;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome) {
        super(nome);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " | Peso: " + this.getPeso() + " kg | Raça: " + raca;
    }

}

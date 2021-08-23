package Level5_01;

public class Peixe extends Animal {

    private String tipoHabitat;

    public Peixe(String nome) {
        super(nome);
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " | Peso: " + this.getPeso() + " kg | Habitat: Água " + tipoHabitat;
    }

}

package Level6_02;

public class ObjetoAnimal implements Animal {

    private String nomeEspecie;
    private String nomeAnimal;

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }
    
    @Override
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    @Override
    public String getNomeAnimal() {
        return nomeAnimal;
    }

}

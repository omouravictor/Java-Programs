package Level6_01;

public abstract class Midia {

    private int codigo;
    private double preco;
    private String nome;

    public Midia() {

    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    abstract public String getTipo();

    abstract public String getDetalhes();

    abstract public void inserirDados();

    public void printDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Tipo: " + getTipo());
        System.out.println(getDetalhes());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

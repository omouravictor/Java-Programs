package Level6_01;

import java.util.Scanner;

public class DVD extends Midia {

    private int nFaixas;

    public DVD() {
    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return "Numero de faixas: " + nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    @Override
    public void inserirDados() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite o nome do DVD: ");
        this.setNome(scan.nextLine());
        System.out.printf("Digite o código do DVD: ");
        this.setCodigo(scan.nextInt());
        System.out.printf("Digite o preço do DVD: ");
        this.setPreco(scan.nextDouble());
        System.out.printf("Digite o número de faixas: ");
        nFaixas = scan.nextInt();
    }

}

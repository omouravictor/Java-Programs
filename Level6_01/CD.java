package Level6_01;

import java.util.Scanner;

public class CD extends Midia {

    private int nMusicas;

    public CD() {
    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return "Numero de músicas: " + nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    @Override
    public void inserirDados() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite o nome do CD: ");
        this.setNome(scan.nextLine());
        System.out.printf("Digite o código do CD: ");
        this.setCodigo(scan.nextInt());
        System.out.printf("Digite o preço do CD: ");
        this.setPreco(scan.nextDouble());
        System.out.printf("Digite o número de músicas: ");
        nMusicas = scan.nextInt();
    }

}

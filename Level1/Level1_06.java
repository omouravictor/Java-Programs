package Level1;

import java.util.Scanner;

public class Level1_06 {

    public static class Planta {

        String nome;
        int qtdEmEstoque;
        int estoqueIdeal;

        public int qtdQuePrecisaComprar() {
            int qtd = 0;
            if (qtdEmEstoque < estoqueIdeal) {
                qtd = estoqueIdeal - qtdEmEstoque;
                return qtd;
            }
            return qtd;
        }
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Planta[] plantas = new Planta[50];

        for (int i = 0; i < 50; i++) {
            plantas[i] = new Planta();
            System.out.printf("Informe o nome da " + (i + 1) + "ª planta (sem espaço): ");
            plantas[i].nome = read.next();
            System.out.printf("Informe a qtd (inteiro) de estoque IDEAL da " + (i + 1) + "ª planta: ");
            plantas[i].estoqueIdeal = read.nextInt();
            System.out.printf("Informe a qtd (inteiro) de estoque ATUAL da " + (i + 1) + "ª planta: ");
            plantas[i].qtdEmEstoque = read.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < 50; i++) {
            if (plantas[i].qtdQuePrecisaComprar() > 0) {
                System.out.println("Nome: " + plantas[i].nome + " || Estoque IDEAL = "
                        + plantas[i].estoqueIdeal + " || Estoque ATUAL = " + plantas[i].qtdEmEstoque
                        + " || Precisa comprar = " + plantas[i].qtdQuePrecisaComprar());
            }
        }

    }
}

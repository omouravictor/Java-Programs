package Level3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Graphs graphs = new Graphs();
        int v1, v2, v3;

        System.out.printf("Informe um vértice: ");
        v1 = read.nextInt();
        System.out.printf("Informe outro vértice: ");
        v2 = read.nextInt();

        if (graphs.areNeighbors(v1, v2)) {
            System.out.println("Os vértices informados SÃO vizinhos.");
        } else {
            System.out.println("Os vértices informados NÃO SÃO vizinhos.");
        }

        System.out.printf("Informe um vértice para ser gerado sua lista de vértices: ");
        v3 = read.nextInt();
        graphs.getNeighborsList(v3).forEach((v) -> {
            System.out.println("- Vértice " + v);
        });
    }

}

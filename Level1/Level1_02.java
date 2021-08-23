package Level1;

import java.util.Scanner;

public class Level1_02 {

    public static boolean ePrimo(int num) {
        if (num == 1) {
            return false;
        }
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void lerVetor(int vet[]) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("Informe o " + (i + 1) + "° número inteiro: ");
            vet[i] = ler.nextInt();
        }
    }

    public static void imprimiPrimos(int vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (ePrimo(vet[i])) {
                System.out.println("Primo = " + vet[i] + " | " + "Posição = " + i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int vet[];

        System.out.printf("Informe o tamanho do vetor: ");
        vet = new int[ler.nextInt()];

        lerVetor(vet);
        imprimiPrimos(vet);

    }
}

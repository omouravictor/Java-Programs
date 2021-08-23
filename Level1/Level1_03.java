package Level1;

import java.util.Scanner;

public class Level1_03 {

    public static int sequencia(int n) {
        if (n < 3) {
            return n;
        }
        return (n - 1) * sequencia(n - 1) + (n * sequencia(n - 2));
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe um numero inteiro para o cálculo da sequência: ");
        System.out.println("Resultado = " + sequencia(ler.nextInt()));

    }
}

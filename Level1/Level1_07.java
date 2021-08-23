package Level1;

import java.util.Scanner;

public class Level1_07 {

    public static int sequencia(int n) {
        if (n < 3) {
            return n;
        }
        return (n - 1) * sequencia(n - 1) + (n * sequencia(n - 2));
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");
        System.out.println("F(n) = 2 * F(n - 1) + 3 * F(n - 2)");
        System.out.println("");
        System.out.printf("Informe um numero inteiro para o cálculo da sequência acima: ");
        System.out.println("Resultado = " + sequencia(read.nextInt()));

    }
}

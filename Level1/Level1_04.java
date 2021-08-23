package Level1;

import java.util.Scanner;

public class Level1_04 {

    public static long[][] leEretornaMatriz() {

        Scanner ler = new Scanner(System.in);
        long dados[][] = new long[10][4];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.printf("Informe a matrícula do aluno " + (i + 1) + ": ");
                        dados[i][j] = ler.nextLong();
                        break;
                    case 1:
                        System.out.printf("Informe o sexo do aluno " + (i + 1) + " (0 para feminino e 1 para masculino): ");
                        dados[i][j] = ler.nextLong();
                        break;
                    case 2:
                        System.out.printf("Informe o código do curso do aluno " + (i + 1) + " (aasccccnnn - cccc código do curso): ");
                        dados[i][j] = ler.nextLong();
                        break;
                    case 3:
                        System.out.printf("Informe o CR do aluno " + (i + 1) + " : ");
                        dados[i][j] = ler.nextLong();
                        break;
                }
            }
        }

        System.out.printf("\n");

        return dados;
    }

    public static void imprimiMatriz(long[][] dados) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Matrícula aluno " + (i + 1) + ": " + dados[i][j] + "");
                        break;
                    case 1:
                        System.out.println("Sexo aluno " + (i + 1) + ": " + dados[i][j] + "");
                        break;
                    case 2:
                        System.out.println("Código curso aluno " + (i + 1) + ": " + dados[i][j] + "");
                        break;
                    case 3:
                        System.out.println("CR aluno " + (i + 1) + ": " + dados[i][j] + "");
                        break;
                }
            }
            System.out.printf("\n");
        }

    }

    public static void imprimiCRmaisAlto(long[][] dados) {

        long crMaisAlto = 0, estudante[][] = new long[1][4];

        for (int i = 0; i < 10; i++) {
            if (dados[i][3] >= crMaisAlto) {
                estudante[0][0] = dados[i][0];
                estudante[0][1] = dados[i][1];
                estudante[0][2] = dados[i][2];
                estudante[0][3] = dados[i][3];
                crMaisAlto = dados[i][3];
            }
        }

        System.out.println("Matrícula CR mais alto: " + estudante[0][0]);
        System.out.println("Sexo CR mais alto: " + estudante[0][1]);
        System.out.println("Código curso CR mais alto: " + estudante[0][2]);
        System.out.println("CR: " + estudante[0][3]);

    }

    public static void main(String[] args) {
        long dados[][] = leEretornaMatriz();
        imprimiMatriz(dados);
        imprimiCRmaisAlto(dados);
    }
}

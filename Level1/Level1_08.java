package Level1;

public class Level1_08 {

    public static void main(String[] args) {

        int vendas[][] = new int[12][4], valor = 1, totalMes = 0, totalSemana[] = {0, 0, 0, 0}, totalAno = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                vendas[i][j] = valor;
                valor++;
            }
        }

        for (int i = 0; i < 12; i++) {
            if (i == 0) {
                System.out.printf("Janeiro - ");
            }
            if (i == 1) {
                System.out.printf("Fevereiro - ");
            }
            if (i == 2) {
                System.out.printf("Março - ");
            }
            if (i == 3) {
                System.out.printf("Abril - ");
            }
            if (i == 4) {
                System.out.printf("Maio - ");
            }
            if (i == 5) {
                System.out.printf("Junho - ");
            }
            if (i == 6) {
                System.out.printf("Julho - ");
            }
            if (i == 7) {
                System.out.printf("Agosto - ");
            }
            if (i == 8) {
                System.out.printf("Setembro - ");
            }
            if (i == 9) {
                System.out.printf("Outubro - ");
            }
            if (i == 10) {
                System.out.printf("Novembro - ");
            }
            if (i == 11) {
                System.out.printf("Dezembro - ");
            }
            for (int j = 0; j < 4; j++) {
                System.out.printf(vendas[i][j] + " ");
                totalMes += vendas[i][j];
                totalSemana[j] += vendas[i][j];
            }
            System.out.println("- Total: " + totalMes);
            totalMes = 0;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Total Semana " + (i + 1) + ": " + totalSemana[i]);
            totalAno += totalSemana[i];
        }

        System.out.println("Total Ano: " + totalAno);

    }
}

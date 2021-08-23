package Level1;

public class Level1_05 {

    public static class Manicure {

        int qtdPesFeitasNoMes;
        int qtdMaosFeitasNoMes;
        int qrdPodologiaFeitasNoMes;

        public Manicure(int qtdPesFeitasNoMes, int qtdMaosFeitasNoMes, int qrdPodologiaFeitasNoMes) {
            this.qtdPesFeitasNoMes = qtdPesFeitasNoMes;
            this.qtdMaosFeitasNoMes = qtdMaosFeitasNoMes;
            this.qrdPodologiaFeitasNoMes = qrdPodologiaFeitasNoMes;
        }

        public double salarioManicure() {
            return 0.5 * ((10 * qtdPesFeitasNoMes) + (10 * qtdMaosFeitasNoMes) + (20 * qrdPodologiaFeitasNoMes));
        }
    }

    public static void main(String[] args) {

        Manicure tabelaSempreBela[] = new Manicure[5];

        tabelaSempreBela[0] = new Manicure(1, 1, 1);
        tabelaSempreBela[1] = new Manicure(2, 2, 2);
        tabelaSempreBela[2] = new Manicure(3, 3, 3);
        tabelaSempreBela[3] = new Manicure(4, 4, 4);
        tabelaSempreBela[4] = new Manicure(5, 5, 5);

        for (int i = 0; i < tabelaSempreBela.length; i++) {
            System.out.printf("Manicure " + (i + 1) + " irá receber %.2f reais.\n",
                    tabelaSempreBela[i].salarioManicure());
        }
    }

}

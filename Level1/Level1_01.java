package Level1;

public class Level1_01 {

    public static int negativos(float vet[]) {

        int qtdNegativos = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                qtdNegativos++;
            }
        }
        return qtdNegativos;
    }

    public static void main(String[] args) {

        float vetor[] = {1, 2, 3, -2, -1};

        System.out.println("Há " + negativos(vetor) + " número(s) negativos no vetor.");

    }

}

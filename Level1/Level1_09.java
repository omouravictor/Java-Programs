package Level1;

public class Level1_09 {

    public static void main(String[] args) {

        int mat[][] = new int[3][3], cont = 1, a = 2, b = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = cont;
                cont++;
                System.out.printf(mat[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriz girada a 90° logo abaixo");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(mat[a][b] + " ");
                a--;
            }
            a = 2;
            b++;
            System.out.println("");
        }

    }
}

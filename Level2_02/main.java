package Level2_02;

public class main {

    public static void main(String[] args) {

        IntegerSet a = new IntegerSet(3); // Cria conjunto com inteiros permitidos de 0 a no máximo 3, caso contrário não será inserido
        IntegerSet b = new IntegerSet(6); // Cria conjunto com inteiros permitidos de 0 a no máximo 6, caso contrário não será inserido

        a.insertElement(0); // Insere o valor 0 no conjunto
        a.deleteElement(0); // DELETA o valor 0 do conjunto
        a.insertElement(1); // Insere o valor 1 no conjunto
        a.insertElement(2); // Insere o valor 2 no conjunto
        a.insertElement(3); // Insere o valor 3 no conjunto

        b.insertElement(3); // Insere o valor 3 no conjunto
        b.insertElement(4); // Insere o valor 4 no conjunto
        b.insertElement(5); // Insere o valor 5 no conjunto
        b.insertElement(6); // Insere o valor 6 no conjunto
        b.deleteElement(6); // DELETA o valor 6 do conjunto

        System.out.println("  A   = " + a.toString()); // Imprime conjunto convertido em String
        System.out.println("  B   = " + b.toString()); // Imprime conjunto convertido em String
        System.out.println("A U B = " + a.setToString(a.getUnionSet(b))); // Imprime União dos conjuntos
        System.out.println("A ∩ B = " + a.setToString(a.getIntersectionSet(b))); // Imprime intersecção dos conjuntos
        System.out.println("A – B = " + a.setToString(a.getDifferenceSet(b))); // Imprime diferença do primeiro para o segundo conjunto
    }

}

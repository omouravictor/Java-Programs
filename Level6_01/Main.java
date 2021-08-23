package Level6_01;

public class Main {

    public static void main(String[] args) {
        
        CD cd = new CD();
        System.out.println("*** Cadastrando CD ***");
        cd.inserirDados();
        System.out.println("");
        System.out.println("*** Imprimindo CD ***");
        cd.printDados();
        System.out.println("");
        
        DVD dvd = new DVD();
        System.out.println("*** Cadastrando DVD ***");
        dvd.inserirDados();
        System.out.println("");
        System.out.println("*** Imprimindo DVD ***");
        dvd.printDados();
    }

}

package Level5_01;

public class Teste {

    public static void main(String[] args) {

        Cachorro c = new Cachorro("Tótó");
        c.setRaca("Pastor Alemão");
        c.setPeso(30.5);

        Peixe p = new Peixe("Nemo");
        p.setTipoHabitat("Salgada");
        p.setPeso(0.5);

        System.out.println(c.toString());
        System.out.println(p.toString());

    }
}

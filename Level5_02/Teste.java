package Level5_02;

public class Teste {

    public static void main(String[] args) {

        Cliente c = new Cliente("Victor", 20, "M");
        Gerente g = new Gerente("Maria", 19, "F");
        Vendedor v = new Vendedor("Gabriel", 18, "M");

        c.setValorDivida(500);
        c.setAnoNascim(2000);
        System.out.println(c.toString());

        g.setMatricula("2018149");
        g.setNomeGerencia("Projetos");
        g.setSalario(5000);

        System.out.println(g.toString());

        v.setValorVendas(1000);
        v.setSalario(0.2 * v.getValorVendas() + v.getValorVendas());
        v.setQntVendas(50);

        System.out.println(v.toString());
    }

}

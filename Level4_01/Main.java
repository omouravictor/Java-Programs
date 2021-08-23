package Level4_01;

public class Main {

    public static void main(String[] args) {

        Polygon polygon = new Polygon(5); // Cria um polígono com no MÁXIMO 5 pontos.

        polygon.insertDot(new Dot(4, 1)); // Inseri o ponto (x = 4, y = 1) no polígono
        polygon.insertDot(new Dot(7, 3)); // Inseri o ponto (x = 7, y = 3) no polígono
        polygon.insertDot(new Dot(6, 6)); // Inseri o ponto (x = 6, y = 6) no polígono
        polygon.insertDot(new Dot(2, 7)); // Inseri o ponto (x = 2, y = 7) no polígono
        polygon.insertDot(new Dot(1, 4)); // Inseri o ponto (x = 1, y = 4) no polígono

        System.out.println(polygon.toString()); // Imprimi os pontos do polígono

        System.out.println("Área = " + polygon.getArea()); // Imprimi a área do polígono

    }

}

package Level2_01;

public class Main {

    public static void main(String[] args) {

        Invoice list[] = {new Invoice(10, "HeadSet Game Warrior", 5, 80), // Inseri 5 produtos com o valor de 80
            new Invoice(10, "HeadSet Game Warrior", -10, 20), // Inseri -10 produtos com o valor de 20
            new Invoice(10, "HeadSet Game Warrior", 4, -5), // Inseri 4 produtos com o valor de -5
            new Invoice(10, "HeadSet Game Warrior", -3, -7)}; // Inseri -3 produtos com o valor de -7

        for (Invoice in : list) { // Imprimi os testes feitos acima
            System.out.println("Numero: " + in.getItemNumber());
            System.out.println("Descrição: " + in.getItemDescription());
            System.out.println("Quantidade comprada: " + in.getBoughtQtd());
            System.out.println("Preço unitário: R$" + in.getPrice());
            System.out.println("Fatura: R$" + in.getInvoiceAmount());
            System.out.println("");
        }

    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Obs.: Tive que retirar a tabela que fiz, pois no beecrowd ele não aceitou passar com ela

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Código === Especificação === PREÇO===");
        System.out.println(" 1 ==== Cachorro-quente = R$ 4,00 ===");
        System.out.println(" 2 ======== X-Salada ==== R$ 4,50 ===");
        System.out.println(" 3 ======== X-Bacon ===== R$ 5,00 ===");
        System.out.println(" 4 ==== Torrada Simples = R$ 2,00 ===");
        System.out.println(" 5 ====== Refrigerante == R$ 1,50 ===");
        System.out.println("=====================================");

        System.out.print("Digite o código do item: ");
        int code = sc.nextInt();
        System.out.print("Digite a quantidade do item: ");
        int quantity = sc.nextInt();

        double totalValue = 0;

        switch (code) {
            case 1:
                totalValue = quantity * 4.00;
                break;
            case 2:
                totalValue = quantity * 4.50;
                break;
            case 3:
                totalValue = quantity * 5.00;
                break;
            case 4:
                totalValue = quantity * 2.00;
                break;
            case 5:
                totalValue = quantity * 1.50;
                break;
            default:
                System.out.println("Código não encontrado!");
        }

        System.out.printf("Total: R$ %.2f%n", totalValue);

        sc.close();
    }
}
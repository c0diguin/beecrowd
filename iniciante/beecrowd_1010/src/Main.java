import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double totalValue = 0.0;

        for (int i = 0; i < 2; i++) {
            int pieceCode = sc.nextInt();
            int pieceQuantity = sc.nextInt();
            double unitValue = sc.nextDouble();

            totalValue += unitValue * pieceQuantity;
        }

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", totalValue));


        sc.close();

    }
}
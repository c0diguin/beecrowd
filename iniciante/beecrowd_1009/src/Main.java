import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String sellerName = sc.nextLine();
        double salary = sc.nextDouble();
        double totalSale = sc.nextDouble();

        double total = salary + (totalSale * 0.15);

        System.out.println("TOTAL = R$ " + String.format("%.2f", total));


    }
}
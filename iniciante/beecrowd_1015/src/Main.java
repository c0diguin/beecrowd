import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double p1x = sc.nextDouble();
        double p1y = sc.nextDouble();
        double p2x = sc.nextDouble();
        double p2y = sc.nextDouble();

        double calc = Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2);
        double distancia = Math.sqrt(calc);

        System.out.printf("%.4f%n", distancia);

        sc.close();

    }
}
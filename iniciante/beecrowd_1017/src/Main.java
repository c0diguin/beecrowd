import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        int velocity = sc.nextInt();

        double spentFuel = (double) (hours * velocity) / 12;

        System.out.printf("%.3f%n", spentFuel);

        sc.close();


    }
}
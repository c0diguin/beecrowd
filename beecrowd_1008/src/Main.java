import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hours = sc.nextInt();
        double valuePerHour = sc.nextDouble();

        double salary = valuePerHour * hours;

        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary));

        sc.close();

    }
}
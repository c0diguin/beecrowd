import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = sc.nextDouble();


        double area = n * Math.pow(raio, 2);

        System.out.println("A=" + String.format("%.4f",area));


    }
}
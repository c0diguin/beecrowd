import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int converterCentavos = (int) Math.round(valor * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int v = converterCentavos / nota;
            System.out.println(v + " nota(s) de R$ " + String.format("%.2f", nota / 100.0));
            converterCentavos %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int v = converterCentavos / moeda;
            System.out.println(v + " moeda(s) de R$ " + String.format("%.2f", moeda / 100.0));
            converterCentavos %= moeda;
        }
        sc.close();

    }
}
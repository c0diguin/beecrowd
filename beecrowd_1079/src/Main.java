import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] testValue = new double[3];
        double[] peso = {2.0, 3.0, 5.0};


        for (int j = 0; j < n; j++) {
            double sumPeso = 0;
            double sum = 0;

            for (int i = 0; i < 3; i++) {
                testValue[i] = sc.nextDouble();
                double calcPeso = testValue[i] * peso[i];
                sum += peso[i];
                sumPeso += calcPeso;
            }

            double media = sumPeso / sum;
            System.out.printf("%.1f%n", media);

        }
        sc.close();

    }
}
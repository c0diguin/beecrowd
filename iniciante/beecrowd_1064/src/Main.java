import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contPositivo = 0;
        double somaPositivos = 0;
        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {
                contPositivo++;
                somaPositivos += valor;
            }
        }

        System.out.println(contPositivo + " valores positivos");
        double mediaPositivos = somaPositivos / contPositivo;
        System.out.printf("%.1f\n", mediaPositivos);


        sc.close();

    }
}
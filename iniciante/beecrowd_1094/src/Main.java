import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int somaRato = 0;
        int somaSapo = 0;
        int somaCoelho = 0;
        int somaTotal = 0;

        for (int i = 0; i < n; i++) {
            int quantia = sc.nextInt();
            char tipo = sc.next().charAt(0);

            if (tipo == 'R') {
                somaRato += quantia;
            } else if (tipo == 'S') {
                somaSapo += quantia;
            } else if (tipo == 'C') {
                somaCoelho += quantia;
            }

            somaTotal += quantia;
        }

        double percentCoelho = (double) (somaCoelho * 100) / somaTotal;
        double percentRato = (double) (somaRato * 100) / somaTotal;
        double percentSapo = (double) (somaSapo * 100) / somaTotal;

        System.out.println("Total: " + somaTotal + " cobaias");
        System.out.println("Total de coelhos: " + somaCoelho);
        System.out.println("Total de ratos: " + somaRato);
        System.out.println("Total de sapos: " + somaSapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentRato);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentSapo);


        sc.close();

    }
}
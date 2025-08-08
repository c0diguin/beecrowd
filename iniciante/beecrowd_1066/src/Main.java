import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;
        int contNegativo = 0;
        int contPositivo = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            if (n > 0) {
                contPositivo++;
            } else if (n < 0) {
                contNegativo++;
            }
        }

        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");

        sc.close();

    }
}
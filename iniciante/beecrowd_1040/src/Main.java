import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = Math.floor((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + n4) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            double mediaFinal = (media + notaExame) / 2.0;
            mediaFinal = Math.floor(mediaFinal * 10) / 10.0;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        sc.close();
    }
}
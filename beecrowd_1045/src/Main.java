import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Double[] descrecente = {a, b, c};

        Arrays.sort(descrecente, Collections.reverseOrder());

        a = descrecente[0];
        b = descrecente[1];
        c = descrecente[2];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double v = Math.pow(b, 2) + Math.pow(c, 2);
            if (Math.pow(a, 2) == v) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (Math.pow(a, 2) > v) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (Math.pow(a, 2) < v) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }

        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || b == c || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();

    }
}
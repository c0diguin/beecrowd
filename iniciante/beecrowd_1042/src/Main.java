import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] valores = {a, b, c};

        Arrays.sort(valores);

        for (int val : valores) {
            System.out.println(val);
        }

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        sc.close();

    }
}
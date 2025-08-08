import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = maximumValue(a, b);
        int result = maximumValue(maiorAB, c);

        System.out.println(result + " eh o maior");

        sc.close();
    }

    public static int maximumValue(int x, int y) {
        return (x + y + Math.abs(x - y)) / 2;
    }
}
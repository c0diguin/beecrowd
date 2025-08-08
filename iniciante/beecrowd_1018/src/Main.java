import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int[] bills = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(A);

        for (int bill : bills) {
            int result = A / bill;
            System.out.println(result + " nota(s) de R$ " + bill + ",00");
            A %= bill;
        }

        sc.close();
    }


}
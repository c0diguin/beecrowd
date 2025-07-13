import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();

        int temp = distance * 2;

        System.out.println(temp + " minutos");

        sc.close();

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int segundos = n % 60;
        int minutos = (n % 3600) / 60;
        int horas = n / 3600;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }
}
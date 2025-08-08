import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] number = new int[100];

        int max = 0;
        int posicao = 0;

        for(int i = 0; i < 100; i++) {
            number[i] = sc.nextInt();

            if(number[i] > max) {
                max = number[i];
                posicao = i;
            }

        }

        System.out.println(max);
        System.out.println(posicao+1);


        sc.close();



    }
}
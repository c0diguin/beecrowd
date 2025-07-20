import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Nesse aqui quis testar o conceito de expressões no switch e gostei bastante
        é bem mais simples e fácil de fazer, vou tentar de agora em diante praticar mais com ele*/

        Scanner sc = new Scanner(System.in);

        int ddd = sc.nextInt();
        String msg = switch (ddd) {
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            case 11 -> "Sao Paulo";
            case 21 -> "Rio de Janeiro";
            case 32 -> "Juiz de Fora";
            case 19 -> "Campinas";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            default -> "DDD nao cadastrado";
        };

        System.out.println(msg);

        sc.close();

    }
}
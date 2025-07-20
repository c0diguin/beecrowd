import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int tempoInicial = horaInicial * 60 + minutoInicial;
        int tempoFinal = horaFinal * 60 + minutoFinal;

        int duracao = tempoFinal - tempoInicial;

        if (duracao <= 0) {
            duracao += 1440;
        }

        int horas = (duracao / 60);
        int minutos = duracao % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        sc.close();
    }
}
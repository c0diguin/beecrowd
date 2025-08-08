import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int calcTotal;
        int dias;
        int horas;
        int minutos;
        int segundos;


        String dia = sc.nextLine();
        String[] diaIn = dia.split(" ");
        String tempo = sc.nextLine();
        String[] tempoIn = tempo.split(" : ");

        String dia2 = sc.nextLine();
        String[] diaIn2 = dia2.split(" ");
        String tempo2 = sc.nextLine();
        String[] tempoIn2 = tempo2.split(" : ");

        int calc = calculoTempo(diaIn,tempoIn);
        int calc2 = calculoTempo(diaIn2,tempoIn2);

        calcTotal = calc2 - calc;

        dias = calcTotal / 86400;
        horas = calcTotal % 86400 / 3600;
        minutos = calcTotal % 3600 / 60;
        segundos = calcTotal % 60;


        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");


        sc.close();

    }

    public static int calculoTempo(String[] dia, String[] tempo) {
        int dias = Integer.parseInt(dia[1]) * 86400;
        int horas = Integer.parseInt(tempo[0]) * 3600;
        int minutos = Integer.parseInt(tempo[1]) * 60;
        int segundos = Integer.parseInt(tempo[2]);

        return dias + horas + minutos + segundos;
    }
}
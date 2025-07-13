import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double trianguleArea = A * C / 2;
        double circleArea = pi * Math.pow(C, 2);
        double trapezeArea = (A + B) * C / 2;
        double squareArea = B*B;
        double rectangleArea = A*B;


        System.out.println("TRIANGULO: " + String.format("%.3f", trianguleArea));
        System.out.println("CIRCULO: " + String.format("%.3f", circleArea));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezeArea));
        System.out.println("QUADRADO: " + String.format("%.3f", squareArea));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangleArea));


        sc.close();

    }
}
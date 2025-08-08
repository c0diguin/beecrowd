import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String primeiraPalavra = sc.nextLine();
        String segundaPalavra = sc.nextLine();
        String terceiraPalavra = sc.nextLine();

        String animal = null;

        if (primeiraPalavra.equals("vertebrado")) {
            if (segundaPalavra.equals("ave")) {
                if (terceiraPalavra.equals("carnivoro")) {
                    animal = "aguia";
                } else if (terceiraPalavra.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (segundaPalavra.equals("mamifero")) {
                if (terceiraPalavra.equals("onivoro")) {
                    animal = "homem";
                } else if (terceiraPalavra.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (primeiraPalavra.equals("invertebrado")) {
            if (segundaPalavra.equals("inseto")) {
                if (terceiraPalavra.equals("hematofago")) {
                    animal = "pulga";
                } else if (terceiraPalavra.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (segundaPalavra.equals("anelideo")) {
                if (terceiraPalavra.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (terceiraPalavra.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);

        sc.close();

    }
}
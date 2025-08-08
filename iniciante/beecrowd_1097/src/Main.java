public class Main {
    public static void main(String[] args) {

        int jvalue = 7;

        for (int i = 1; i <= 9; i += 2) {
            for (int j = jvalue; j >= jvalue - 2; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
            jvalue += 2;
        }
    }
}

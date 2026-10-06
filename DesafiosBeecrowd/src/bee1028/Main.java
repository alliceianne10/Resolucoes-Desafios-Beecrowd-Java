package bee1028;
import java.util.Scanner;

public class Main {

    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i = 0; i < num; i++){
            int f1 = scan.nextInt();
            int f2 = scan.nextInt();

            System.out.println(mdc(f1,f2));
        }
    }
}

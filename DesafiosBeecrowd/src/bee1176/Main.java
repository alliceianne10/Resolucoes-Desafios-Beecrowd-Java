package bee1176;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int repeticoes = scan.nextInt();

        for (int i = 0; i < repeticoes; i++){
            int fib = scan.nextInt();

            long a = 0;
            long b = 1;
            long temp = 0;

            for (int j = 0; j < fib; j++){
                temp = b;
                b = a + b;
                a = temp;
            }
            System.out.printf("Fib(%d) = %d\n", fib, a );
        }
    }
}

package bee1177;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < 1000; i++){
            System.out.printf("N[%d] = %d\n", i, i%T);
        }

        scan.close();
    }
}

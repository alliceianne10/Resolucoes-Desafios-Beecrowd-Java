package bee1541;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int A = scan.nextInt();
            if (A == 0){
                break;
            }
            int B = scan.nextInt();
            int C = scan.nextInt();

            int lado = (int) Math.sqrt(A*B*100/C);

            System.out.println(lado);

        }
    }
}

package bee1930;
import java.util.Scanner;

public class Main {
    public static int calculaMaximoDeAparelhos(int[] tomadas) {
        int aparelhos = -3;
        for (int i = 0; i < 4; i++) {
            aparelhos += tomadas[i];
        }
        return aparelhos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tomadas = new int[4];

        for (int i = 0; i < 4; i++) {
            tomadas[i] = scan.nextInt();
        }

        System.out.println(calculaMaximoDeAparelhos(tomadas));
    }
}

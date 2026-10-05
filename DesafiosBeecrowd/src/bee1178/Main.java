package bee1178;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double []vetor = new double[100];

        vetor[0] = scan.nextDouble();

        System.out.printf("N[0] = %.4f\n", vetor[0]);

        for(int i = 1; i< 100; i++){
            vetor[i] = vetor[i-1]/2;
            System.out.printf("N[%d] = %.4f\n", i, vetor[i]);
        }
        scan.close();
    }
}

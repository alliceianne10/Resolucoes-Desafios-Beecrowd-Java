package bee1160;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++){
            int PA = scan.nextInt();
            int PB = scan.nextInt();
            double G1 = scan.nextDouble();
            double G2 = scan.nextDouble();

            int anos = 0;
            while (PA <= PB){
                PA += (int) (PA*(G1/100));
                PB += (int) (PB*(G2/100));
                anos ++;

                if (anos > 100){
                    break;
                }
            }

            if (anos > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println(anos + " anos.");
            }
        }
    }
}

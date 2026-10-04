package bee1036;
import java.util.Scanner;
import java.util.Locale;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double delta = (b*b) - (4*a*c);
        if (delta < 0 || a == 0){
            System.out.println("Impossivel calcular");
        }else{
            double r1 = (-b + Math.sqrt(delta))/ (2*a);
            double r2 = (-b - Math.sqrt(delta)) /(2*a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}

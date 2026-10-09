package bee1079;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String DeterminarNota(double nota1, double nota2, double nota3){
        double notaCalculada = (nota1 * 2 + nota2*3 + nota3*5)/10;
        return String.format("%.1f", notaCalculada);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int repeticoes = scan.nextInt();

        for (int i = 0; i < repeticoes; i++){
            double nota1 = scan.nextDouble();
            double nota2 = scan.nextDouble();
            double nota3 = scan.nextDouble();

            System.out.println(DeterminarNota(nota1,nota2,nota3));
        }
    }
}

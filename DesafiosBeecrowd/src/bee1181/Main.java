package bee1181;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int linha = scan.nextInt();
        String operacao = scan.next();

        double matriz[][] = new double[12][12];
        for (int i = 0; i < 12; i ++){
            for (int j = 0; j < 12; j++){
                matriz[i][j] = scan.nextDouble();
            }
        }

        double soma = 0.0;
        for (int j = 0; j < 12; j++){
            soma += matriz[linha][j];
        }

        if (operacao.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else{
            double media = soma/12.0;
            System.out.printf("%.1f\n", media);
        }
        scan.close();
    }
}

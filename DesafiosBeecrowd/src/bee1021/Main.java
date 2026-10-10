package bee1021;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void CalcularNotasEMoedas(double valor){

        int valorSemCentavos = (int) Math.round(valor*100);

        int[] notas = {10000,5000,2000,1000,500,200};
        for (int i = 0; i < notas.length; i++) {
            if (i == 0) {
                System.out.println("NOTAS:");
            }
            int quantidadeNotas =  (valorSemCentavos / notas[i]);
            valorSemCentavos %= notas[i];

            System.out.printf("%d nota(s) de R$ %d.00\n", quantidadeNotas, notas[i]/100);
        }

        int[] cedulas = {100,50,25,10,5,1};

            for (int i = 0; i < cedulas.length; i++) {
                if (i == 0){
                    System.out.println("MOEDAS:");
                }
                int quantidadeMoedas =  (valorSemCentavos / cedulas[i]);
                valorSemCentavos %= cedulas[i];

                System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, cedulas[i]/100.0);
            }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double valor = scan.nextDouble();
        CalcularNotasEMoedas(valor);
    }
}

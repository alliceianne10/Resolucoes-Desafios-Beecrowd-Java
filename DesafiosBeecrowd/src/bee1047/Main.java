package bee1047;
import java.util.Scanner;

public class Main {
    public static String calcularTempoJogo(int horaInicial, int minutoInicial, int horaFinal, int minutoFinal) {
      int minutosEvento = (horaFinal*60 + minutoFinal) - (horaInicial*60 + minutoInicial);
      if (minutosEvento <= 0){
          minutosEvento += 1440;
      }
      int horasTotal = minutosEvento / 60;
      int minutosTotal = minutosEvento % 60;

      return ("O JOGO DUROU " + horasTotal + " HORA(S) E " + minutosTotal + " MINUTO(S)");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horaIncial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        System.out.println(calcularTempoJogo(horaIncial, minutoInicial, horaFinal, minutoFinal));

        scan.close();
    }
}

package bee1131;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gremio = 0;
        int inter = 0;
        int empate = 0;
        int cont = 0;

        while (true){
            int golsInter = scan.nextInt();
            int golsGremio = scan.nextInt();

            if (golsGremio > golsInter){
                gremio ++;
            } else if (golsGremio < golsInter) {
                inter ++;
            }else{
                empate ++;
            }
            cont ++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            int continuar =(scan.nextInt());

            if (continuar == 2){
                break;
            }
        }

        System.out.println(cont + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);
        if (inter > gremio){
            System.out.println("Inter venceu mais");
        }else if (inter < gremio){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
    }
}

package bee1180;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();

        int []vetor = new int[X];

        int menor = 0;
        int pos = 0;
        for (int i = 0; i < X; i++){
            vetor[i] = scan.nextInt();

            if (i == 0){
                menor = vetor[i];
            }else{
                if(vetor[i] < menor){
                    menor = vetor[i];
                    pos = i;
                }
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pos);

    }
}

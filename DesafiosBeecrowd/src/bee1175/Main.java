package bee1175;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int []vetor = new int[20];

        for (int i = 0; i <= 19; i++){
            vetor[i] = scan.nextInt();
        }

        for(int i = 0; i <= 9; i++){
            int num = vetor[i];
            vetor[i] = vetor[19-i];
            vetor[19-i] = num;
        }

        for(int i = 0; i <= 19; i++){
            System.out.printf("N[%d] = %d\n", i, vetor[i]);
        }

        scan.close();
    }
}

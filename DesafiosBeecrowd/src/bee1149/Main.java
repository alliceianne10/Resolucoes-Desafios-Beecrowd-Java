package bee1149;
import java.util.Scanner;

public class Main {
    public static int CalcularASoma(int A, int N){
        int soma = 0;
        for (int i = 0; i <= N-1; i++){
            soma += i + A;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int N = scan.nextInt();

        while (N <=0 ){
             N = scan.nextInt();
        }

        System.out.println(CalcularASoma(A,N));
    }
}

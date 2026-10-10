package bee1150;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Z = scan.nextInt();

        while (X >= Z){
            Z = scan.nextInt();
        }

        int soma = 0;
        int cont = 0;
        for (int i = X; i <= Z ; i++) {
            if (soma >= Z){
                break;
            }
            soma += i;
            cont++;
        }

        System.out.println(cont);
    }
}

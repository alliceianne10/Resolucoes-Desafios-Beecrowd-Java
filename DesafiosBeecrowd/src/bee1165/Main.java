package bee1165;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int repeticoes = scan.nextInt();

        for (int i = 0; i < repeticoes; i++){
            int num = scan.nextInt();

            int cont = 0;
            for (int j = 2; j < num; j++ ){
                if (num % j == 0){
                    cont += 1;
                }
            }

            if (cont >= 1){
                System.out.println(num + " nao eh primo");
            }else{
                System.out.println(num + " eh primo");
            }
        }
        scan.close();
    }
}

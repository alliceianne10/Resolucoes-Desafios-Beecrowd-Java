package bee1159;

import java.util.Scanner;

public class Main {
    public static int somaParesConsecutivos(int num){
        int soma = 0;
        for (int i = num ; i <= num+9 ; i++) {
            if (i % 2 == 0){
                soma += i;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int num = scan.nextInt();
            if (num == 0){
                break;
            }
            System.out.println(somaParesConsecutivos(num));
        }
    }
}

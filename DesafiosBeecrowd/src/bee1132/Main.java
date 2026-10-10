package bee1132;

import java.util.Scanner;

public class Main {
    public static int somaDosMultiplos13(int num1, int num2){
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);

        int soma = 0;
        for (int i = min; i <= max ; i++) {
            if (i % 13 != 0){
                soma += i;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(somaDosMultiplos13(num1,num2));
    }
}

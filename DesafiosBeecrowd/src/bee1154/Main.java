package bee1154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int cont = 0;
        while (true){
            int numero = scan.nextInt();

            if (numero < 0){
                break;
            }

            cont += 1;
            soma += numero;
        }

        double media = (double) soma/cont;

        System.out.printf("%.2f\n",media);
    }
}

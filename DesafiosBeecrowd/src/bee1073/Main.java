package bee1073;

import java.util.Scanner;

public class Main {
    public static void quadradoPares(int numero){
        for (int i = 2 ; i <= numero; i += 2) {
            System.out.println(i + "^2" + " = " + i*i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        quadradoPares(numero);
    }
}

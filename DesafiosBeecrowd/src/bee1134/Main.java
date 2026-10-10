package bee1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        Scanner scan = new Scanner(System.in);

        while(true){
            int num = scan.nextInt();

            if (num == 1){
                alcool++;
            } else if (num == 2) {
                gasolina++;
            } else if (num == 3) {
                diesel ++;
            } else if (num == 4) {
                break;
            }
        }

        System.out.print("MUITO OBRIGADO\n" + "Alcool: " + alcool + "\n" + "Gasolina: " + gasolina + "\n" + "Diesel: " + diesel + "\n");
    }
}
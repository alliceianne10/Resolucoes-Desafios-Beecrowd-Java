package bee1038;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo = scan.nextInt();
        int quant = scan.nextInt();
        double valor = 0;

        switch (codigo){
            case 1:
                valor = quant * 4.00;
                break;
            case 2:
                valor = quant * 4.50;
                break;
            case 3:
                valor = quant * 5.00;
                break;
            case 4:
                valor = quant * 2.00;
                break;
            case 5:
                valor = quant * 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f\n", valor);
    }
}

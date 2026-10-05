package bee1151;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int a = 0;
        int b = 1;
        int temp = 0;

        for(int i = 0; i < num; i++){
            if ( i == num -1){
                System.out.println(a);
            }else {
                System.out.print(a + " ");
                temp = b;
                b = a + b;
                a = temp;
            }
        }
    }
}

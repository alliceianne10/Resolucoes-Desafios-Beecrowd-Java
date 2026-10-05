package bee1145;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int Y = scan.nextInt();

       for (int i = 1; i<= Y; i+= X ){
           for(int j = i; j<= i+X-1; j++){
               if (j == i+X-1){
                   System.out.print(j);
               }else{
                   System.out.print(j + " ");
               }
           }
            System.out.println();
        }
    }
}

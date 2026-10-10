package bee1142;

import java.util.Scanner;

public class Main {
   public static void pum(int num){
       for (int i = 1; i <= num*4; i ++) {
           if (i % 4 == 0){
               System.out.println("PUM");
           }else{
               System.out.print(i + " ");
           }
       }
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        pum(num);
    }
}

package bee1146;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            int num = scan.nextInt();

            if (num == 0){
                break;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= num; i++){
                sb.append(i);

                if (i != num){
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
        scan.close();
    }
}

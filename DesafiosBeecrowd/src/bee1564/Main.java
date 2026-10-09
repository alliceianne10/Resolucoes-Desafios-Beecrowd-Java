package bee1564;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static String VaiTerCopaOuNao(int reclamacoes){
        return  (reclamacoes > 0) ? "vai ter duas!" : "vai ter copa!";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       while (true){
           try{
               int reclamacoes = scan.nextInt();
               System.out.println(VaiTerCopaOuNao(reclamacoes));
           }catch (NoSuchElementException e){
               break;
           }
       }
       scan.close();
    }
}

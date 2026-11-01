package bee1253;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int repeticoes = scan.nextInt();

        for (int i = 0; i < repeticoes; i++) {
            String mensagem = scan.next();
            int posicao = scan.nextInt();

            char[] arrayChar = mensagem.toCharArray();

            for (int j = 0; j < arrayChar.length; j++) {
                char novoCarac = (char) (arrayChar[j] - posicao);

                if (novoCarac < 'A'){
                    novoCarac += 26;
                }

                arrayChar[j] = novoCarac;
            }
            System.out.println(arrayChar);
        }
    }
}

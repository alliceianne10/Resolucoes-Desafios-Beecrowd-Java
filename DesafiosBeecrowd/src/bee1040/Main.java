package bee1040;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        double media = ((n1*2) + (n2*3) + (n3*4) + (n4))/10.0;
        media = (Math.floor(media*10.0)) /10.0;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");

            double novaNota = scan.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", novaNota);
            double novaMedia = (novaNota + media)/2;
            novaMedia = (Math.floor(novaMedia*10.0)) /10.0;

            if (novaMedia >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", novaMedia);
        }

    }
}

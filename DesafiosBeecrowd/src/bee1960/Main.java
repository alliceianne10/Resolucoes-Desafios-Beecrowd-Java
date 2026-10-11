package bee1960;

import java.util.Scanner;

public class Main {
    public static int[] separaONumero(int num) {
        return new int[]{(num / 100), ((num % 100) / 10), (num % 100) % 10};
    }

    public static String centenasEmRomano(int centena){
        String[] centenasRomano = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        return centenasRomano[centena - 1];
    }

    public static String dezenaEmRomano(int dezena){
        String[] dezenasRomano = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return dezenasRomano[dezena - 1];
    }

    public static String unidadeEmRomano(int unidade){
        String[] unidadesRomano = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return unidadesRomano[unidade - 1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int[] numeroSeparado = separaONumero(num);

        if (numeroSeparado[0] != 0){
            System.out.print(centenasEmRomano(numeroSeparado[0]));
        }
        if (numeroSeparado[1] != 0){
            System.out.print(dezenaEmRomano(numeroSeparado[1]));
        }if (numeroSeparado[2] != 0)
            System.out.println(unidadeEmRomano(numeroSeparado[2]));
        else{
            System.out.println();
        }
        scan.close();
    }
}

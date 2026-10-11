package bee1022;

import java.util.Scanner;

public class Main {
    public static int mdc(int d1, int d2){
        int max = Math.max(d1,d2);
        int min = Math.min(d1,d2);

        while (min != 0){
            int resto = max % min;
            max = min;
            min = resto;
        }
        return max;
    }
    public static String simplificarFracao(int numerador, int denominador){
        int mdcFracao = Math.abs(mdc(numerador,denominador));
        int numSimplificado;
        int denSimplificado;

        if (mdcFracao > 1){
            numSimplificado = numerador/mdcFracao;
            denSimplificado = denominador/mdcFracao;
        }else{
            numSimplificado = numerador;
            denSimplificado = denominador;
        }
        return numSimplificado + "/" + denSimplificado;
    }

    public static String somaFracao(int n1, int d1, int n2, int d2){
        int denominador = d1*d2;
        int numerador = n1*d2 + n2*d1;
        String fracaoSimplficada = simplificarFracao(numerador, denominador);
        return numerador + "/" + denominador + " = " + fracaoSimplficada;
    }

    public static String subtrairFracao(int n1, int d1, int n2, int d2){
        int denominador = d1*d2;
        int numerador = n1*d2 - n2*d1;
        String fracaoSimplificada = simplificarFracao(numerador, denominador);
        return numerador + "/" + denominador + " = " + fracaoSimplificada;
    }

    public static String multiplicarFracao(int n1, int d1, int n2, int d2){
        int numerador = n1*n2;
        int denominador = d1*d2;
        String fracaoSimplificada = simplificarFracao(numerador, denominador);
        return numerador + "/" + denominador + " = " + fracaoSimplificada;
    }

    public static String dividirFracao(int n1, int d1, int n2, int d2){
        int numerador = n1*d2;
        int denominador = n2*d1;
        String fracaoSimplificada = simplificarFracao(numerador, denominador);
        return numerador + "/" + denominador + " = " + fracaoSimplificada;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int repeticoes = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < repeticoes; i++) {
            String entrada = scan.nextLine();

            String[] entradaLimpa = entrada.split(" ");

            int n1 = Integer.parseInt(entradaLimpa[0]);
            int d1 = Integer.parseInt(entradaLimpa[2]);
            String operacao = entradaLimpa[3];
            int n2 = Integer.parseInt(entradaLimpa[4]);
            int d2 = Integer.parseInt(entradaLimpa[6]);

            switch (operacao) {
                case "+" -> System.out.println(somaFracao(n1, d1, n2, d2));
                case "-" -> System.out.println(subtrairFracao(n1, d1, n2, d2));
                case "*" -> System.out.println(multiplicarFracao(n1, d1, n2, d2));
                default -> System.out.println(dividirFracao(n1, d1, n2, d2));
            }
        }
    }
}

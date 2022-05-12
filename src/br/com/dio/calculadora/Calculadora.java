package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrai = subtracao(a, b);
        int multiplica = multiplicacao(a, b);
        float divide = divisao(a, b);

        System.out.println("Resultados:");
        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + subtrai);
        System.out.println(a + " * " + b + " = " + multiplica);
        System.out.println(a + " / " + b + " = " + divide);
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    public static int multiplicacao(int a, int b){
        return a * b;
    }

    public static float divisao(int a, int b){
        float resultado = (float) a / b;
        return resultado;
    }

}

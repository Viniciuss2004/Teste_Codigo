package Fibonacci;

import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma posição de Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("\nA posição Fib(" + n + ") é: " + fibonacciRecursiva(n));
    }

    public static int fibonacciRecursiva(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2);
    }
}
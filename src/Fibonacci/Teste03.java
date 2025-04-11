package Fibonacci;

import java.util.Scanner;

public class Teste03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma posição de Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("\nA posição Fib(" + n + ") é: " + fibonacciLinear(n));
    }

    public static long fibonacciLinear(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
package Fibonacci;

public class Teste01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.println("fib(" + i + ") = " + fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser maior ou igual a 0!");
        }

        if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
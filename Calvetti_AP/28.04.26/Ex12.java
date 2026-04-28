import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        int original = n;

        System.out.print("Fatores primos de " + original + ": ");

        do {
            int divisor = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    divisor = i;
                    break;
                }
            }
            System.out.print(divisor + " ");
            n = n / divisor;
        } while (n > 1);

        System.out.println();
        sc.close();
    }
}
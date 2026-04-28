import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite o valor de N: ");
            int n = sc.nextInt();
            int soma = 0;

            for (int i = 2; i <= n; i += 2) {
                soma += i;
            }
            System.out.println("Soma dos números pares de 1 a " + n + ": " + soma);

            System.out.print("Deseja repetir para outro N? (S/N): ");
            resposta = sc.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        sc.close();
    }
}
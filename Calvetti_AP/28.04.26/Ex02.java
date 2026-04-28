import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;

        do {
            System.out.print("Digite a nota 1 (0 a 10): ");
            nota1 = sc.nextDouble();
            if (nota1 < 0 || nota1 > 10)
                System.out.println("Nota inválida! Tente novamente.");
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a nota 2 (0 a 10): ");
            nota2 = sc.nextDouble();
            if (nota2 < 0 || nota2 > 10)
                System.out.println("Nota inválida! Tente novamente.");
        } while (nota2 < 0 || nota2 > 10);

        System.out.print("Barra de progresso: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Processando... ");
        }
        System.out.println();

        double media = (nota1 + nota2) / 2;
        System.out.printf("Média aritmética: %.2f%n", media);

        sc.close();
    }
}
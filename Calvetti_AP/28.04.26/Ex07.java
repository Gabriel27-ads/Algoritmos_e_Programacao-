import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            double somaLote = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Peso da peça " + i + ": ");
                somaLote += sc.nextDouble();
            }
            double media = somaLote / 5;
            System.out.printf("Média do lote: %.2f%n", media);

            System.out.print("Processar novo lote? (S/N): ");
            resposta = sc.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        sc.close();
    }
}
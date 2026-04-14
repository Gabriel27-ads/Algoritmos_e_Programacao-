import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        int anterior = 0;
        int atual = 1;
        int cont = 0;

        while (cont < n) {
            System.out.println(anterior);

            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            cont++;
        }

        sc.close();
    }
}
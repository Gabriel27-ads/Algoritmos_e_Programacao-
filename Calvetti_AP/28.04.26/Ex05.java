import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dentro = 0, fora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            if (num >= 10 && num <= 20)
                dentro++;
            else
                fora++;
        }
        System.out.println("Números no intervalo [10, 20]: " + dentro);
        System.out.println("Números fora do intervalo: " + fora);
        sc.close();
    }
}
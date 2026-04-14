import java.util.Scanner;
public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para a contagem regressiva: ");
        int n = sc.nextInt();
        while (n >= 0) {
            System.out.println("Sistema operando. T-menos " + n + " segundos");
            n--;
        }
        sc.close();
    }
}

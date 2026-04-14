import java.util.Scanner;
public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int m = 1;
        System.out.println("Os multiplos de 3 dentro da tabuada ate 10 do numero " + n + " são:");
        while (m < 11) {
           int valor = n * m;
           if (valor % 3 == 0) {
               System.out.println(valor);
           }
           m++;
        }
        sc.close();
    }
}
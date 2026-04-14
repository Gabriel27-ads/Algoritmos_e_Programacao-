import java.util.Scanner;
public class While9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        double resultado = a;
        int cont = 0;
        while(resultado > 1){
         resultado = resultado / b;
         cont++;
        }

        System.out.println("Log aproximado: " + cont);

        sc.close();
    }
}

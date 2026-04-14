import java.util.Scanner;
public class While8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial em °K ");
        double inicial = sc.nextDouble();
        System.out.print("Digite o valor final em °K");
        double final_ = sc.nextDouble();
        System.err.print("Digite o valor do passo: ");
        double passo = sc.nextDouble();

        System.out.println("inicial\t\tCelsius");

        while(inicial <= final_ ){
            double celsius = inicial - 273.15;
            System.out.println(inicial + "\t\t" + celsius);
            inicial += passo;
        }
        sc.close();
    }
}

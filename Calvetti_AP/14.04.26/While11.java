import java.util.Scanner;
public class While11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para descobrir se ele é primo: ");
        double n = sc.nextDouble();
        int divisor = 2;
boolean primo = true;

while (divisor <= Math.sqrt(n)) {
    if (n % divisor == 0) {  // achou um divisor!
        primo = false;
        break;               // interrompe o loop
    }
    divisor++;
}

if (primo) {
    System.out.println(n + " é primo!");
} else {
    System.out.println(n + " não é primo!");
}
sc.close();
    }
}

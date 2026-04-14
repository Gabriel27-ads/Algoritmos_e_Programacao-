import java.util.Scanner;
public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        long a = sc.nextLong();
        System.out.print("Digite o segundo número: ");
        long b = sc.nextLong();
        long c = a + 1;
            
        
            if(a > b){
                System.out.println("O primeiro número não pode ser maior que o segundo");}
            else if (a == b){
                System.out.println("Os números são iguais");}
            else if (b - a == 1){
                System.out.println("Não existem números inteiros entre " + a + " e " + b);}


        while(a < c && c < b){
            System.out.println("Os números entre " + a + " e " + b + " são:");
            System.out.println(c);
            c++;
        }
        sc.close();
    }
}

import java.util.Scanner;
public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double temp = 0.0;
        double soma = 0.0; 

        while(temp != 999) {
            System.out.print("Digite a temperatura (999 p/ sair): ");
            temp = sc.nextDouble(); 

            if(temp != 999) {
                soma += temp;  
                cont = cont + 1;
            }
        }

       
        if(cont > 0) {
            double media = soma / cont;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhuma nota foi digitada.");
        }

        sc.close();
    }
}

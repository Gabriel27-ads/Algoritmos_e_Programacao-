import java.util.Scanner;
public class While6{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int blocos = 0;
    double menor = 0;
    double maior = 0;
    double soma = 0;

        while( blocos < 10){
            System.out.print("Digite a altura do bloco: ");
            double altura = sc.nextDouble();

            soma += altura;
            if (altura > maior) maior = altura;
            if (altura < menor) menor = altura;
            blocos++;

        }
        double media = soma / 10;
        System.out.println("Média: " + media);
        System.out.println("O bloco maior mede: " + maior);
        System.out.println("O bloco menor mede: " + menor);
        
    sc.close();
    }
    
}
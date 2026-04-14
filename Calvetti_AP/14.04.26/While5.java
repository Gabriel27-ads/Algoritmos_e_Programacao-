import java.util.Scanner;
public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SenhaCorreta = 1234;
        int tentativas = 3;
        int SenhaDigitada = 0;
        while (SenhaDigitada != SenhaCorreta && tentativas > 0) {
            System.out.print("Digite a senha: ");
            SenhaDigitada = sc.nextInt();
            tentativas--;
            if(SenhaDigitada != SenhaCorreta) {
            System.out.print("Senha Incorreta. Restam " + tentativas + " tentativas.\n");
            }
        }
        if(SenhaDigitada == SenhaCorreta) {
            System.out.println("Acesso permitido");
        } 
        else {
            System.out.println("Acesso negado");
        }
     sc.close();
    }
}

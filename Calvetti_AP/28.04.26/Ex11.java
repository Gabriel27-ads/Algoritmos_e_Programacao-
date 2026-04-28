import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENHA_CORRETA = 1234;
        boolean acertou = false;

        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            int senha;
            do {
                System.out.print("Tentativa " + tentativa + " - Digite uma senha de 4 dígitos: ");
                senha = sc.nextInt();
                if (senha < 1000 || senha > 9999)
                    System.out.println("Senha inválida! Deve ter exatamente 4 dígitos.");
            } while (senha < 1000 || senha > 9999);

            if (senha == SENHA_CORRETA) {
                System.out.println("Acesso liberado!");
                acertou = true;
                break;
            } else {
                System.out.println("Senha incorreta.");
            }
        }
        if (!acertou)
            System.out.println("Acesso bloqueado! Número de tentativas esgotado.");

        sc.close();
    }
}
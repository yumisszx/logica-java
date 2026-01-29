//Validação de senha
//repita a leitura de senha até o usuário digitar a correta
//senha correta: 2416137

//importar biblioteca do scanner
import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        //senha correta
        final int SENHA_CORRETA = 2416137;
        int senhaDigitada;

        //laço para ler a senha até que seja a correta
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();

            //mensagem de erro se senha estiver incorreta
            if (senhaDigitada != SENHA_CORRETA) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (senhaDigitada != SENHA_CORRETA);

        //mensagem de sucesso
        System.out.println("Acesso permitido. Senha correta!");

        //fechar scanner
        scanner.close();
    }
}



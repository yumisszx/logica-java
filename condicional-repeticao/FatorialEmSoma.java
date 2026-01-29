//Fatorial sem multiplicação direta
//leia um número N e calcule o fatorial, mas faça a multiplicação como soma repetida

//import biblioteca do scanner
import java.util.Scanner;

public class FatorialEmSoma {
    public static void main(String[] args) {
        //cria scanner
        Scanner scanner = new Scanner(System.in);

        //variavel numero
        int n;

        //verifica se o número é negativo
        do{
            //leia um número N
            System.out.print("Digite um número inteiro não negativo: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Número inválido! Por favor, digite um número inteiro não negativo.");
            }
        } while (n < 0);

        //inicializa o fatorial como 1
        int fatorial = 1;

        //calcula o fatorial usando soma repetida
        for (int i = 1; i <= n; i++) {
            int soma = 0;
            for (int j = 0; j < fatorial; j++) {
                soma += i;
            }
            fatorial = soma;
        }

        //exibe o resultado
        System.out.println("O fatorial de " + n + " é: " + fatorial);

        //fecha o scanner
        scanner.close();
    }
}
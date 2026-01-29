//Maior e menor numero
///leia 6 números e print o maior e o menor

//importar biblioteca do scanner
import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; //inicializa o maior com o menor valor possível
        int menor = Integer.MAX_VALUE; //inicializa o menor com o maior valor possível

        //laço para ler 6 números
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            //verifica se o número é maior que o maior atual
            if (numero > maior) {
                maior = numero; //atualiza o maior
            }

            //verifica se o número é menor que o menor atual
            if (numero < menor) {
                menor = numero; //atualiza o menor
            }
        }

        //printar o maior e o menor número
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        //fechar scanner
        scanner.close();
    }
}

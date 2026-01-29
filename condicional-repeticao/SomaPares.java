//Soma dos pares até N
//somar apenas os números pares de 1 até N

//importar biblioteca do scanner
import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        //ler número
        System.out.print("Somar números pares até o número: ");
        int numero = scanner.nextInt();

        //variável soma
        int soma = 0;

        //laço para somar os números pares de 2 até numero 
        for (int i = 2; i <= numero; i += 2) {
            soma += i; //adiciona o número par à soma
        }

        //printar o resultado da soma
        System.out.println("A soma dos números pares de 1 até " + numero + " é: " + soma);

        //fechar scanner
        scanner.close();
    }
}
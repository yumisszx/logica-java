//Soma acumulada
//ler um número e usar laço para somar todos os números de 1 até N.

//import biblioteca do scanner
import java.util.Scanner;

public class SomaAcumulada{
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        //ler número
        System.out.print("Digite um número inteiro para fazer a soma acumulada: ");
        int numero = scanner.nextInt();

        //variável para soma acumulada
        int soma = 0;

        //laço para somar de 1 até N
        for (int i = 1; i <= numero; i++) {
            soma += i; //soma dos números
        }

        //printar resultado
        System.out.println("A soma acumulada de 1 até " + numero + " é: " + soma);

        //fechar scanner
        scanner.close();
    }
}

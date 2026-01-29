//Números menores que a média
//leia 5 números, calcule a média e mostre quais são menores que ela

//importar biblioteca do scanner
import java.util.Scanner;

public class MenorQueMedia {
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        //array para armazenar os números
        int[] numeros = new int[5];
        int soma = 0;

        //laço para ler 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; //acumula a soma dos números
        }

        //calcular a média
        double media = soma / 5.0;
        System.out.println("A média é: " + media);

        //mostrar os números menores que a média
        System.out.println("Números menores que a média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]); //print do número menor que a média
            }
        }

        //fechar scanner
        scanner.close();
    }
}
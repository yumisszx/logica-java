//Contagem regressiva
//ler um número e imprime contagem regressiva até 0

//import biblioteca do scanner
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        //ler número
        System.out.print("Digite o número de início da contagem regressiva: ");
        int numero = scanner.nextInt();

        //printar contagem regressiva
        System.out.println("Contagem regressiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        //fechar scanner
        scanner.close();
    }
}
//Tabuada por somas
//leia um número e monte a tabuada até 10 usando apenas somas

//importar biblioteca do scanner
import java.util.Scanner;

public class TabuadaEmSoma {
    public static void main(String[] args) {
        //objeto scanner
        Scanner scanner = new Scanner(System.in);

        //ler número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        //laço para calcular a tabuada de 1 a 10 usando somas
        for (int i = 1; i <= 10; i++) {
            int resultado = 0;

            //calcular o resultado da multiplicação como soma repetida
            for (int j = 0; j < i; j++) {
                resultado += numero; //adiciona o número à soma
            }

            //printar tabuada
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        //fechar scanner
        scanner.close();
    }
}
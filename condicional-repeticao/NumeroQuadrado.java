//Quadrado de números de 1 a 10
//laço para mostrar o número e seu quadrado

public class NumeroQuadrado {
    public static void main(String[] args) {
        //laço para imprimir números de 1 a 10 e seus quadrados
        System.out.println("Veja o número e seu quadrado de 1 a 10:");

        for (int i = 1; i <= 10; i++) {
            int quadrado = i * i; //calcula o quadrado do número
            System.out.println("Número: " + i + ", Quadrado: " + quadrado); //print do número e seu quadrado
        }
    }
}
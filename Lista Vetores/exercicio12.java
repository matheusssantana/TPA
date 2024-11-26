import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] A = new int[10];

        System.out.println("Digite 10 números inteiros no vetor:");

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + i + ": ");
            A[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < A.length / 2; i++) {
            if (A[i] != A[A.length - 1 - i]) {
                
                System.out.println("O vetor NÃO é um palíndromo!");
                scanner.close();
                return;
            }
        }

        
        System.out.println("O vetor é um palíndromo!");
        
        scanner.close();
    }
}

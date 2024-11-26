import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] A = new int[10];
        
        
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + i + ": ");
            A[i] = scanner.nextInt();
        }
        
        
        int[] B = new int[10];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1; 
            } else {
                B[i] = 0; 
            }
        }
        
        
        System.out.print("Vetor A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        System.out.print("Vetor B: ");
        for (int num : B) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

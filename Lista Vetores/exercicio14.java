import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] A = new int[10];
        int[] B = new int[10];
        
        
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }
        
        
        System.out.println("\nDigite 10 números inteiros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }
        
        
        int[] C = new int[10];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }
        
        
        System.out.print("\nVetor A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nVetor B: ");
        for (int num : B) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nVetor C: ");
        for (int num : C) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}

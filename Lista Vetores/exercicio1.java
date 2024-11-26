import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int indexPar = 0;
        int indexImpar = 19;

        
        System.out.println("Digite 20 n�meros inteiros:");
        for (int i = 0; i < 20; i++) {
            A[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 20; i++) {
            if (A[i] % 2 == 0) {
                B[indexPar] = A[i];
                indexPar++;
            } else {
                B[indexImpar] = A[i];
                indexImpar--;
            }
        }

        
        System.out.println("Vetor B com pares no in�cio e �mpares no final:");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
        
    }
}

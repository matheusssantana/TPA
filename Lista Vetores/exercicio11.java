import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int[] vetorA = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que deseja procurar no vetor: ");
        int x = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == x) {
                System.out.println("Número encontrado: " + x);
                contador++;
                break;
            }
        }

        if (contador == 0) {
            System.out.println("Número não encontrado no vetor.");
        }

        scanner.close();
    }
}

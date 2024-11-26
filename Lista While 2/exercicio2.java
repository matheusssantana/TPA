import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor para a sequência de Fibonacci: ");
        int n = in.nextInt();

        int a = 0, b = 1, c;
        System.out.print("Sequência de Fibonacci: " + a + ", " + b);

        int i = 2;
        while (i < n) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
            i++;
        }
    }
}

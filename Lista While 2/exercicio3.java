import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o intervalo inicial: ");
        int inicio = in.nextInt();
        
        System.out.print("Digite o intervalo final: ");
        int fim = in.nextInt();

        int soma = 0, quantidade = 0;
        int i = inicio;

        while (i <= fim) {
            soma += i;
            quantidade++;
            i++;
        }

        double media = (double) soma / quantidade;
        System.out.println("A média dos números entre " + inicio + " e " + fim + " é: " + media);
    }
}

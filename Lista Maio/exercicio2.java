import java.util.Scanner;
public class salarioexercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("Digite o número:");
		n= ler.nextInt();
		if(n>=1) {
			System.out.println("O número é positivo.");
		
	}else if(n==0) {
		System.out.println("O número é neutro.");
	}else {
		System.out.println("O número é negativo.");
	} ler.close();
	}}

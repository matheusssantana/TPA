import java.util.Scanner;
public class exercicio3clima {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double f, c;
		System.out.println("Digite o grau em fahrenheit:");
		f= ler.nextInt();
		c=(f-32)/ 1.8;
		System.out.println( c + " celsius" );
		if(c<15) {
			System.out.println("Está frio.");
		
	}else if(c>=22) {
		System.out.println("Está Calor.");
	}else {
		System.out.println("Está ameno.");
	} ler.close();
	}}

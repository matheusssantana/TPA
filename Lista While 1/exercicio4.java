import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int i = 0;
        
        while (i < 10) {
            System.out.print("Digite o ano de nascimento: ");
            int anoNascimento = in.nextInt();
            
            System.out.print("Digite o ano atual: ");
            int anoAtual = in.nextInt();
            
            int idade = anoAtual - anoNascimento;
            
            if (idade >= 18) {
                System.out.println("MAIOR de idade/ Idade: " + idade);
            } else {
                System.out.println("MENOR de idade/ Idade: " + idade);
            }
            
            i++;
        }
        
    }
}

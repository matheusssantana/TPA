import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] faixas = new int[5];
        int maisVelho = 0;
        int maisJovem = Integer.MAX_VALUE;
        int i = 0;
        
        while (i < 15) {
            System.out.print("Digite a idade: ");
            int idade = in.nextInt();
            
            if (idade <= 15) {
                faixas[0]++;
            } else if (idade <= 30) {
                faixas[1]++;
            } else if (idade <= 45) {
                faixas[2]++;
            } else if (idade <= 60) {
                faixas[3]++;
            } else {
                faixas[4]++;
            }
            
            if (idade > maisVelho) {
                maisVelho = idade;
            }
            if (idade < maisJovem) {
                maisJovem = idade;
            }
            
            i++;
        }
        
        System.out.println("Faixa 1 (Até 15 anos): " + faixas[0]);
        System.out.println("Faixa 2 (16 a 30 anos): " + faixas[1]);
        System.out.println("Faixa 3 (31 a 45 anos): " + faixas[2]);
        System.out.println("Faixa 4 (46 a 60 anos): " + faixas[3]);
        System.out.println("Faixa 5 (Acima de 61 anos): " + faixas[4]);
        System.out.println("Mais velho: " + maisVelho);
        System.out.println("Mais jovem: " + maisJovem);
        
        in.close();
    }
}

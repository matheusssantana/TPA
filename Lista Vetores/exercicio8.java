public class exercicio8 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = new int[10];

        for (int i = 0; i < A.length; i++) {
            int soma = 0;
            for (int j = 1; j <= A[i]; j++) {
                soma = soma + j;
            }
            B[i] = soma;
            
            System.out.println(A[i] + ":  " + B[i]);
        }
    }
}

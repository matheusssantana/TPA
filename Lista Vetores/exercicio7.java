public class exercicio7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] B = new int[15];

        for (int i = 0; i < A.length; i++) {
            int fatorial = 1;
            for (int j = 1; j <= A[i]; j++) {
                fatorial = fatorial * j;
            }
            B[i] = fatorial;
            System.out.println(A[i] + ":  " + "O fatorial é: " + B[i]);
        }
    }
}

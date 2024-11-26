public class exercicio5 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ": ");
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

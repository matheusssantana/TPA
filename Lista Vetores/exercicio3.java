public class exercicio3 {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int i = 0; i < A.length; i++) {
            int contadorDivisores = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    contadorDivisores++;
                }
            }

            if (contadorDivisores == 2) {
                System.out.println(A[i] + " é primo");
            } else {
                System.out.println(A[i] + " não é primo");
            }
        }
    }
}

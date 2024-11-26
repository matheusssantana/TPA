public class exercicio9 {
    public static void main(String[] args) {
        
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {5, 6, 7, 8, 11, 12, 13, 14, 15, 16};

       
        System.out.print("Interseção dos vetores A e B: ");
        
        
        for (int i = 0; i < A.length; i++) {
            
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                }
            }
        }
    }
}

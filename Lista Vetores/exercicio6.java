public class exercicio6 {
    public static void main(String[] args) {
        int[] A = new int[11];

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println("2 elevado à " + i + " =  " + A[i]);
        }
    }
}

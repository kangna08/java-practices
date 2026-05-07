public class INVERTEDHALF {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {   // rows
            for (int j = 1; j <= i; j++) { // columns
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class strongnnumber {

    // factorial function
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // strong number check function
    static void checkStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is NOT a Strong Number");
        }
    }

    public static void main(String[] args) {
        checkStrong(145);
    }
}
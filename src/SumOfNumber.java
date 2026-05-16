import java.util.Scanner;

public class SumOfNumber {

    // Function to calculate sum
    public static int findSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + i;

        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int n = sc.nextInt();

        System.out.println("Sum is: " + findSum(n));
    }
}
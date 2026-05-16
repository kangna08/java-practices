import java.util.Scanner;

public class greatervaluefunc {

    static int greatervalue(int a, int b) {

        if (a > b) {
            return a;
        }
        else {
            return b;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        int result = greatervalue(a, b);

        System.out.println("Greater Number is: " + result);

    }
}
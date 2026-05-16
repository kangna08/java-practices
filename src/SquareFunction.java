import java.util.Scanner;

public class SquareFunction {

    public static int squareFunction(int sqr) {

        int result = sqr * sqr;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Kindly enter the digit or number");

        int sqr = sc.nextInt();

        System.out.println(squareFunction(sqr));
    }
}
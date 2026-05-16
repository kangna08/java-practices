import java.util.Scanner;

public class Posnegzerofunction {

    static String checkNumber(int num) {

        if (num == 0) {
            return "Zero";
        }
        else if (num > 0) {
            return "Positive";
        }
        else {
            return "Negative";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(checkNumber(num));

    }
}
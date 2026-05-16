import java.util.Scanner;

public class countofdigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int counter = 0;

        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            counter = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                counter++;
            }
        }

        System.out.println("The digit is " + counter);
    }
}
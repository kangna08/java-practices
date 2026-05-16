import java.util.Scanner;

public class DivisibleCheck  {


    static void CheckNumber(int num) {
        if (num % 5 == 0 || num % 11 == 0) {
            System.out.println("Number is divisible by 5 and 11");
        } else {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number here");
        int num = sc.nextInt();
        CheckNumber(num);
}
}
import java.util.Scanner;

public class LCM {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
 //  lcm jiska find krna hai usko gcd se devide kr do  multiplay krke
        int lcm = (a * b) / gcd(a, b);

        System.out.println(lcm);
    }
}
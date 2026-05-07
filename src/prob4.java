import java.util.Scanner;
public class prob4 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your  first number");
        int a = sc.nextInt();
        System.out.println("enter your  second number ");
        int b = sc.nextInt();
        System.out.println("enter your third number ");
        int c = sc.nextInt();
        if (a>=b && a>=b){
            System.out.println("A is largest number");
        }else if (b>=a && b>=c) {
            System.out.println("B is largest number");
        }
        if  (c>=a && c>=b){
            System.out.println("C is largest number");
        }

    }
}

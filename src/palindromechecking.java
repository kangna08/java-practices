import java.util.Scanner;
public class palindromechecking {
    static void main(String[] args) {
        int reverse=0;

        Scanner sc = new Scanner (System.in);
        System.out.println("enter the numbers");
        int num = sc.nextInt();
        int orignal =num;
        while(num>0){
            reverse= reverse *10+num%10;
            num=num/10;

        }
        if
            (reverse==orignal){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }

}

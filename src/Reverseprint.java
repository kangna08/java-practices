import java.util.Scanner;

public class Reverseprint {

    static void main(String[] args) {
 Scanner sc= new Scanner (System.in);
        System.out.println("enter the numbers");
 int num = sc.nextInt();


    int reverse =0;
      while (num >0){
           reverse = reverse *10+num%10;
           num=num/10;
        }
        System.out.println(reverse);
    }
}
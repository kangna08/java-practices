import java.util.Scanner;
public class prob3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
         if (a>b){
             System.out.println("a is greater then b");
         }else if (a<b){
             System.out.println("b is greater then a");
         }else{
             System.out.println("both are equal");
         }

    }
}

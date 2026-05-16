import java.util.Scanner;
public class GCDHCF {
    static void main(String[] args) {

        System.out.println("HII ENTER THE NUMBER ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        while( b!=0){
            int temp = b;
            b= a%b;
            a=temp;


        }
        System.out.println("The digit is " + a);
    }

}
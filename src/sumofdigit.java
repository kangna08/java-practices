import java.util.Scanner;

public class sumofdigit {
    static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
          int lastdigit =num%10;
            sum=sum+lastdigit;
            num=num/10;


        }
        System.out.println(sum);
    }
}

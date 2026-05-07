import java.util.Scanner;
public class prob2 {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numbers =sc.nextInt();
        if (numbers<0){
            System.out.println("you have entered negative  number");
        }else if (numbers>0){
            System.out.println("you have entered positive number");

        }else{
            System.out.println("you have entered zero");
        }
    }
}

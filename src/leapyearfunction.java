import java.util.Scanner;

public class leapyearfunction {
    public  static  String Checkleapyear (int leapyear){
        if (leapyear%400==0 ||leapyear%4==0 || leapyear%100!=0){
            return "Its a leap year";
        }else {
            return "Its not a  leap year";
        }

    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int leapyear = sc.nextInt();
        System.out.println(Checkleapyear(leapyear));
    }


}


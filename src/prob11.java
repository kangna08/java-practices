import java.util.Scanner;

public class prob11 {
    static long prob11 (int n ){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result =  result * i;

        }
        return result ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     long ans = prob11(n);
     System.out.println(ans);


        }

    }


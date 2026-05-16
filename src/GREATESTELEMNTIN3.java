public class GREATESTELEMNTIN3 {

    static int Greatfunc(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }

        else if (b >= a && b >= c) {
            return b;
        }

        else {
            return c;
        }
    }

    public static void main(String[] args) {

        int ans = Greatfunc(10, 25, 15);

        System.out.println("Greatest Number is: " + ans);
    }
}
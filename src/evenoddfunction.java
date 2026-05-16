public class evenoddfunction {

     static String checkevenodd(int n ) {
         if (n % 2 == 0) {
             return "Even" ;
         } else {
             return "Odd" ;
         }
     }

    public static void main(String[] args) {
        System.out.println(checkevenodd(2));
        System.out.println(checkevenodd(8));
    }
}

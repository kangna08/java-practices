public class findthesumofaArray {
    static void main(String[] args) {
        int arr1[]= {2,4,6,8,10};
        int sum =0;

        for(int i=0; i<arr1.length; i++){
            sum=sum+arr1[i];
        }
        System.out.println(sum);
    }
}

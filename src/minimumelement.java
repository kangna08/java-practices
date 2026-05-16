public class minimumelement {
    static void main(String[] args) {
        int arr[]={22,45,55,33,78,10};
        int min =Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println(min);
    }
}

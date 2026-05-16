public class maximumelement {
    static void main(String[] args) {
        int arr[] = {12, 13, 14, 15, 10};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }



        }
        System.out.println(max);
    }
}
